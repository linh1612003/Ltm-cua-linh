# mid-project-336488296
# Chủ đề: Xây dựng ứng dụng nhắn tin - Chat app
1. Thông tin nhóm:
	- Lê Văn Duy - B21DCCN296
	- Phạm Ngọc Linh - B21DCCN488
	- Nguyễn Thị Thu Hiền - B21DCCN336
2.  Công nghệ sử dụng
	- Ngôn ngữ lập trình: Java
	- Công nghệ: JavaSwing, TCP Socket, Multi Thread
3. Thư Viện Xử Lý
	- Java AWT: Để chụp ảnh màn hình.
	- Socket: Để thiết lập kết nối giữa client và server.
	- Zip4j: dùng để nén và tạo mật khẩu mã hóa cho file và folder.
4. Cài đặt môi trường:
	- Đảm bảo cài đặt JDK trên máy tính
5. Giao tiếp:
 	Server và client giao tiếp thông qua kết nối socket. Client gửi yêu cầu đến server, server xử lý yêu cầu và gửi kết quả trở lại client.
6. Kiến Trúc
	Ứng dụng được thiết kế theo kiến trúc Client-Server. Server lắng nghe yêu cầu từ client thông qua socket và thực hiện các chức năng tương ứng.
7. Các chức năng chính của ứng dụng chat:
- Kết nối giữa client và server:
	+ Khi client và server kết nối thành công, máy client có thể bắt đầu các hoạt động giao tiếp với server.
	+ Quản lý trạng thái kết nối (bắt đầu, kết thúc, kết nối lại).

- Trò chuyện thời gian thực:
	+ Gửi và nhận tin nhắn văn bản giữa các máy client và server theo thời gian thực.
	+ Hiển thị thời gian gửi tin nhắn và trạng thái tin nhắn (đã gửi, đã nhận, đã xem).
	+ Thông báo nhập tin nhắn: Hiển thị trạng thái khi một người dùng đang nhập tin nhắn.

- Gửi và nhận tệp tin:
	+ Upload tệp tin từ máy client lên server, cho phép chia sẻ tài liệu, hình ảnh, video, v.v.
	+ Download tệp tin từ server về máy client, với khả năng xem trước các tệp tin đa phương tiện (hình ảnh, video) trong ứng dụng chat.

- Gọi thoại và video thời gian thực:
	+ Gọi thoại (Voice Call): Cho phép người dùng gọi điện qua mạng giữa các client và server.
	+ Gọi video (Video Call): Trò chuyện qua video giữa các máy client và server với chất lượng hình ảnh và âm thanh tốt.
	+ Hiển thị trạng thái cuộc gọi (đang đổ chuông, đang kết nối, cuộc gọi kết thúc).

- Thông báo (Notifications):
	+ Thông báo tin nhắn mới khi cửa sổ chat không ở phía trước hoặc khi ứng dụng chat đang chạy nền.
	+ Thông báo cuộc gọi đến cho các cuộc gọi thoại và video.

- Quản lý tệp đính kèm:
	+ Chụp ảnh màn hình và chia sẻ ngay lập tức qua chat.
	+ Lưu trữ và quản lý các tệp tin đã được chia sẻ trong cuộc trò chuyện (danh sách các tệp đã tải lên/tải xuống).

- Tìm kiếm và quản lý lịch sử trò chuyện:
	+ Tìm kiếm tin nhắn: Dễ dàng tìm kiếm tin nhắn theo từ khóa, ngày tháng, hoặc người gửi.
	+ Lưu và tải lại lịch sử trò chuyện giữa các lần kết nối khác nhau.
	+ Xóa lịch sử trò chuyện: Cho phép người dùng xóa toàn bộ hoặc một phần lịch sử trò chuyện.
- Chức năng nhóm chat (Group Chat):
	+ Tạo nhóm chat: Cho phép nhiều người dùng trò chuyện trong cùng một nhóm.
	+ Quản lý thành viên: Thêm, xóa hoặc phân quyền quản trị nhóm chat.
	+ Thông báo nhóm: Quản lý thông báo cho toàn nhóm hoặc tắt thông báo cho các cuộc trò chuyện không quan trọng.

- Chế độ "Đã đọc" và "Đã xem":	
	+ Hiển thị khi một tin nhắn đã được người nhận đọc hoặc xem.
