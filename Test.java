import java.util.Scanner;
c class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        String ma = sc.nextLine();
        System.out.print("Nhập tiêu đề: ");
        String tieuDe = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        int nam = sc.nextInt();
        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();
        Sach s1 = new Sach(ma, tieuDe, tacGia, nam, soLuong);

        System.out.println("\n--- Thông tin sách vừa nhập ---");
        s1.hienThiThongTin();

        sc.close();
    }
}
