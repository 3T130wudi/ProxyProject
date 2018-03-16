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
}
