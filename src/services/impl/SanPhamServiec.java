/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.SanPham;
import repositorys.ISanPhamRepository;
import repositorys.impl.SanPhamRepositoryImpl;
import services.ISanPhamServices;
import viewmodels.SanPhamViewModel;

/**
 *
 * @author phuoc
 */
public class SanPhamServiec implements ISanPhamServices {

    private ISanPhamRepository sanPhamReposory;
    private List<SanPhamViewModel> getListSP;
    private List<SanPhamViewModel> locTheoDanhMucSP;

    public SanPhamServiec() {
        sanPhamReposory = new SanPhamRepositoryImpl();
        getListSP = new ArrayList<>();

    }

    @Override
    public List<SanPhamViewModel> getListSanPham() {

        try {
            List<SanPham> list = sanPhamReposory.getListSanPham();
            for (SanPham sanPham : list) {
                getListSP.add(new SanPhamViewModel(sanPham.getMa(), sanPham.getTen(), sanPham.getMauSac(), sanPham.getKhuyenMai(), sanPham.getKichCo(),
                        sanPham.getChatLieu(), sanPham.getSoLuongTon(), sanPham.getGiaBan()));
            }

        } catch (Exception ex) {
            Logger.getLogger(SanPhamServiec.class.getName()).log(Level.SEVERE, null, ex);
        }
        return getListSP;
    }

    @Override
    public boolean updateSoLuongSP(String Masp, int SoLuong) {

        return sanPhamReposory.updateSoLuongSP(Masp, SoLuong);
    }

    @Override
    public Integer getIdSanPham(String MaSP) {
        return sanPhamReposory.getIdSanPham(MaSP);
    }

    @Override
    public List<SanPham> seachSanPham(String Ten) {
        return sanPhamReposory.seachSanPham(Ten);

    }

    @Override
    public List<SanPham> seachBarCodeS(String barcode) {
        return sanPhamReposory.seachSanPham(barcode);
    }

    @Override
    public List<SanPhamViewModel> locTheoDanhMucSP(String TenDanhMuc) {
        locTheoDanhMucSP = new ArrayList<>();
        try {
            List<SanPham> list = sanPhamReposory.locTheoDanhMucSP(TenDanhMuc);
            for (SanPham sanPham : list) {
                locTheoDanhMucSP.add(new SanPhamViewModel(sanPham.getMa(), sanPham.getTen(), sanPham.getMauSac(), sanPham.getKhuyenMai(), sanPham.getKichCo(),
                        sanPham.getChatLieu(), sanPham.getSoLuongTon(), sanPham.getGiaBan()));
            }

        } catch (Exception ex) {
            Logger.getLogger(SanPhamServiec.class.getName()).log(Level.SEVERE, null, ex);
        }
        return locTheoDanhMucSP;
    }

}
