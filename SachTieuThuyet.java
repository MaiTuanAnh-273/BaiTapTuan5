public class SachTieuThuyet extends Sach {
    private String theLoai;
    private boolean laSachSeries;

    public SachTieuThuyet(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong,
                           String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public boolean isLaSachSeries() {
        return laSachSeries;
    }

    public void setLaSachSeries(boolean laSachSeries) {
        this.laSachSeries = laSachSeries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mã sách: ").append(getMaSach()).append(System.lineSeparator());
        sb.append("Tiêu đề: ").append(getTieuDe()).append(System.lineSeparator());
        sb.append("Tác giả: ").append(getTacGia()).append(System.lineSeparator());
        sb.append("Năm xuất bản: ").append(getNamXuatBan()).append(System.lineSeparator());
        sb.append("Số lượng: ").append(getSoLuong()).append(System.lineSeparator());
        sb.append("Thể loại: ").append(theLoai).append(System.lineSeparator());
        sb.append("Thuộc series: ").append(laSachSeries ? "Có" : "Không").append(System.lineSeparator());
        sb.append("-------------------------");
        return sb.toString();
    }
}
