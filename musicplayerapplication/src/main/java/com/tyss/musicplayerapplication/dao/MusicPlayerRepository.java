package com.tyss.musicplayerapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.musicplayerapplication.entity.MusicPlayer;

@Repository
public interface MusicPlayerRepository extends JpaRepository<MusicPlayer, Integer> {

}