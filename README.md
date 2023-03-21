# NewsAPI
### Đây là một RESTful API đơn giảm cho web tin tức, gồm các tính năng thêm mới, cập nhật, xoá và phân trang.
# Mô tả
### Sử dụng Spring data JPA để giao tiếp với cơ sở dữ liệu. NewsAPI có các chức năng sau:
- Thêm mới : Thêm bài viết bằng dữ liệu đầu vào dạng JSON, sử dụng method Post và url cho chức năng này là "/new".
- Cập nhật : Cập nhật bài viết theo id lấy từ đường dẫn, sử dụng method Put và url cho chức năng này là "/new/{id}", nó sẽ lấy id bằng PathVariable.
- Xoá : Xoá bài viết theo id dữ liệu truyền vào, sử dụng method Delete và url cho chức năng này là "/new".
- Phân trang : Tổng số bài viết sẽ là 'totalPage', mỗi trang có 'limit' bài viết. Dùng method Get và url "/new?page = page_trang & limit = limit_trang".
# Công cụ và Framework
- MySQL
- Spring Data JPA
# Các bước chạy ứng dụng
- Cài đặt MySQL , nếu máy chưa cài thì có thể tải tại: https://www.mysql.com/downloads/
- Trong MySQL workbench , chạy query để tạo dữ liệu tại file query.txt
- Tại IDE, mở application.properties để thay đổi username và password phù hợp với cơ sở dữ liệu tại máy của bạn.
- Run application và các table sẽ tự động được tạo. Giờ có thể thực hiện call API.
