package com.tdtu.dacntt1.roominghouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdtu.dacntt1.roominghouse.model.Announcement;

public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
