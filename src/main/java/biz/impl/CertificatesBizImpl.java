package biz.impl;

import biz.CertificatesBiz;
import dao.CertificatesDao;
import entity.Certificates;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CertificatesBizImpl implements CertificatesBiz {
    @Resource
    private CertificatesDao certificatesDao;
    public List<Certificates> selectcertificates() {
        return certificatesDao.selectcertificates();

    }

    public List<Certificates> certificatesselect(Certificates certificates) {
        return certificatesDao.certificatesselect(certificates);
    }

    public boolean insertcertificates(Certificates certificates) {
        return certificatesDao.insertcertificates(certificates)>0;
    }

    public boolean updatecertificates(Certificates certificates) {
        return certificatesDao.updatecertificates(certificates)>0;
    }

    public Certificates selectficates(Certificates certificates) {
        return certificatesDao.selectficates(certificates);
    }

    public boolean deletecertificates(int certificates_id) {
        return certificatesDao.deletecertificates(certificates_id)>0;
    }
}
