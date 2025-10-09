    public class Test {
    public static void main(String[] args) {
            // Tạo một số sách chuyên biệt
            SachGiaoTrinh sg1 = new SachGiaoTrinh("B001", "Lập trình Java", "Nguyễn Văn A", 2022, 10, "Lập trình", "Đại học");
            SachGiaoTrinh sg2 = new SachGiaoTrinh("B004", "Toán rời rạc", "Phạm Thị D", 2019, 8, "Toán", "Đại học");
            SachTieuThuyet st1 = new SachTieuThuyet("B002", "Cấu trúc dữ liệu", "Trần Thị B", 2021, 5, "Khoa học viễn tưởng", false);
            SachTieuThuyet st2 = new SachTieuThuyet("B003", "Mạng máy tính", "Lê Văn C", 2020, 7, "Hành động", true);

            QuanLySach ql = new QuanLySach();

            // Thêm sách
            ql.them(sg1);
            ql.them(st1);
            ql.them(st2);
            ql.them(sg2);

            System.out.println("== Hiển thị danh sách sau khi thêm ==");
            ql.hienThiDanhSach();

            // Tìm sách theo mã
            System.out.println("\n== Tìm sách có mã B002 ==");
            Sach found = ql.timTheoMa("B002");
            if (found != null) {
                System.out.println(found.toString());
            } else {
                System.out.println("Không tìm thấy sách có mã B002");
            }

            // Cập nhật: thay B002 bằng một quyển mới
            System.out.println("\n== Cập nhật sách B002 ==");
            SachTieuThuyet updated = new SachTieuThuyet("B002", "Cấu trúc dữ liệu - Bản cập nhật", "Trần Thị B", 2024, 12, "Giáo trình", false);
            boolean updatedOk = ql.capNhat("B002", updated);
            System.out.println("Cập nhật thành công: " + updatedOk);
            ql.hienThiDanhSach();

            // Xóa sách B003
            System.out.println("\n== Xóa sách có mã B003 ==");
            boolean deleted = ql.xoaTheoMa("B003");
            System.out.println("Xóa thành công: " + deleted);
            ql.hienThiDanhSach();
    }
}
