$(function () {
    content_control.run();
});


var cache  = {};

var content_control = {
    run : function () {
        this.load_category();
        this.load_table_data();
    },
    load_category : function () {
        $.ajax({
            dataType: 'json',
            url: '/getCategory.form',
            success: function (data) {
                cache['category'] = data;
                $.each(data, function (index, val) {
                    var content = '<li class="category">' + val + '</li>';
                    $('#by-category>ul').append(content);
                });
            }
        });
    },
    load_table_data : function () {
        $.ajax({
            dataType : 'json',
            url : '/getProdures.form',
            success : function (data) {
                cache['table_data'] = data;
                $.each(data,function (index, val) {
                    var content =
                    '<tr>' +
                        '<td>'+val['title']+'</td>' +
                        '<td>'+val['type']+'</td>' +
                        '<td>'+val['number']+'</td>' +
                        '<td>'+val['description']+'</td>' +
                        '<td>'+val['filePath']+'</td>' +
                        '<td>'+val['category_id']+'</td>' +
                        '<td>'+val['category_id']+'</td>' +
                        '<td>'+val['tag_id']+'</td>' +
                     '</tr>';
                    $('#data-number').append(content);
                })
            }
        })
    }
};