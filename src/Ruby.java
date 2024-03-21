
<h1>ユーザー一覧</h1>
<div class="row">
      <table class='table table-hover table-inverse'>
        <thead>
          <tr>
            <th class="bg-light">会員ID</th>
            <th class="bg-light">ユーザーネーム</th>
            <th class="bg-light">メールアドレス</th>
          </tr>
        </thead>
        <% @customers.each do |customer| %>
        <tr>
          <td><%= customer.id %></td>
          <td><%= link_to customer.name, admin_customer_path(customer.id) %></td>
          <td><%= customer.email %></td>
        </tr>
        <% end %>
      </table>
    </div>
    <div class="text-center">
      <%= paginate @customers %>
    </div>