/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kissan.photoappalbums.service;


import com.kissan.photoappalbums.data.AlbumEntity;
import java.util.List;

public interface AlbumsService {
    List<com.kissan.photoappalbums.data.AlbumEntity> getAlbums(String userId);
}
