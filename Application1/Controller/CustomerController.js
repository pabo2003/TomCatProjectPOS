let selectCustomerRow = null;


/*Load All Customers*/
const loadAllCustomers = () =>{
    $.ajax({
        url : "http://localhost:9090/Application1_Web_exploded/customer",
        type : "GET",
        success : (response) =>{
            console.log(response);

            const tableBody = $('#customerTableBody');
            tableBody.empty();

            response.forEach(customer => {
                tableBody.append(`
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.name}</td>
                    <td>${customer.address}</td>
                </tr>
                `)
            })
        },
        error : (err) => {
            console.log(err);
        }
    });
}

const loadTable = () => {
    $('#loadAllCustomers').click(() => {
        loadAllCustomers();
    });
}