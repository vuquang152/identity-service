package com.example.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.identityservice.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, String> {}
