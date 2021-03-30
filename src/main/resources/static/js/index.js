console.log("index.js");

$(document).ready(function(){
    loadContactList();
});

function loadContactList() {
    $.ajax({
        type: "GET",
        url: '/contacts',
        data: {},
        success: function (data) {
            console.log(data);
            var tbody = '';
            for(var i = 0; i < data.length; i++)
            {
                var row = data[i];
                tbody += '<tr>' +
                            '<td>' + (i + 1) + '</td>' +
                            '<td>' + row['full_name'] + '</td>' +
                            '<td>' + row['type'] + '</td>' +
                            '<td><a href="/detail?id=' + row['id'] + '">Detail</a></td>' +
                        '</tr>'
            }

            $('#tbody').html(tbody);
        }
    });
}