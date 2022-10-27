package br.com.brunolutterbach.aluraflix.dto;

import br.com.brunolutterbach.aluraflix.model.Video;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class VideoDto {

    private Long id;
    private String titulo;
    private String descricao;
    private String url;

    public VideoDto(Video video) {
        this.id = video.getId();
        this.titulo = video.getTitulo();
        this.descricao = video.getDescricao();
        this.url = video.getUrl();
    }

    public static List<VideoDto> converter(List<Video> videos) {
        return videos.stream().map(VideoDto::new).collect(Collectors.toList());
    }
}
