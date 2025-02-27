/**
 * StudentAddressService.java
 * class for StudentAddressService
 * Author: Zintle Zothe(216130565)
 * Date: 14 June 2022
 */
package za.ac.cput.school_management.service;

import org.springframework.stereotype.Service;
import za.ac.cput.school_management.domain.StudentAddress;
import za.ac.cput.school_management.repository.IStudentAddressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentAddressService implements IStudentAddressService{
    private final IStudentAddressRepository repository;
    public StudentAddressService(IStudentAddressRepository repository){
        this.repository=repository;
    };


    @Override
    public StudentAddress save(StudentAddress studentAddress) {

        return this.repository.save(studentAddress);
    }

    @Override
    public Optional<StudentAddress> read(String studentId) {
        return this.repository.findById(studentId);
    }

    @Override
    public void delete(StudentAddress studentAddress) {
        this.repository.delete(studentAddress);
    }

    @Override
    public List<StudentAddress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public List<StudentAddress> findStudentAddressByStudentId(String studentId) {
        return this.repository.findStudentAddressByStudentId(studentId);
    }


}
