/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.List;
import models.ThuongHieu;
import repositorys.IThuongHieuRepository;
import repositorys.impl.ThuongHieuRepositoryImpl;
import services.IThuongHieuService;
import viewmodels.Objecttt;
/**
 *
 * @author Admin 88
 */
public class ThuongHieuServiceImpl implements IThuongHieuService{
    private IThuongHieuRepository thuongHieuRepository = new ThuongHieuRepositoryImpl();

    @Override
    public List<ThuongHieu> getAll() {
        return thuongHieuRepository.getAll();
    }

    @Override
    public String Add(Objecttt x) {
        ThuongHieu thuonghieu = new ThuongHieu(x.getId(), x.getTen());
        int xxx = thuongHieuRepository.insert(thuonghieu);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Update(Objecttt x, int id) {
        ThuongHieu thuonghieu = new ThuongHieu(x.getId(), x.getTen());
        int xxx = thuongHieuRepository.update(thuonghieu, id);
        if (xxx == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public String Delete(int id) {
        if (thuongHieuRepository.delete(id) == 1) {
            return "Thành công";
        }
        return "Thất bại";
    }

    @Override
    public ThuongHieu getbyid(int id) {
        return thuongHieuRepository.getbyid(id);
    }
}
