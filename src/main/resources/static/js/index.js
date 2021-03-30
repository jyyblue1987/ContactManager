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
                            '<td>' + row['id'] + '</td>' +
                            '<td>' + row['email'] + '</td>' +
                            '<td>' + row['full_name'] + '</td>' +
                            '<td>' + row['type'] + '</td>' +
                            '<td>' + row['phone_number'] + '</td>' +
                            '<td>' + row['address'] + '</td>' +
                        '</tr>'
            }

            $('#tbody').html(tbody);
        }
    });
}