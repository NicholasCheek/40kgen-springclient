package com.fordytoo._kgen.Controllers;

import com.fordytoo._kgen.Entities.Chapter;
import com.fordytoo._kgen.Repositories.ChapterRepository;
import com.fordytoo._kgen.Services.ChapterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ChapterController {

    public ChapterController(ChapterRepository chapterRepository, ChapterService chapterService) {
        this.chapterRepository = chapterRepository;
        this.chapterService = chapterService;
    }

    private final ChapterRepository chapterRepository;
    private final ChapterService chapterService;

    @GetMapping("/chapters")
    public List<Chapter> getChapters() {
        return (List<Chapter>) chapterRepository.findAll();
    }

    @PostMapping("/chapters")
    void addChapter(@RequestBody Chapter chapter) {
        chapterRepository.save(chapter);
    }

    @GetMapping(value = "/chapters/random-why-founded", produces = "application/json")
    public Map<String, String> getRandomWhyFounded() {
        return Map.of("value", chapterService.getRandomWhyFounded());
    }

    @GetMapping(value ="/chapters/random-when-founded", produces = "application/json")
    public Map<String, String> getRandomWhenFounded() {
        return Map.of("value", chapterService.getRandomWhenFounded());
    }

    @GetMapping(value = "/chapters/random-progenitor", produces = "application/json")
    public Map<String, String> getRandomProgenitor() {
        return Map.of("value", chapterService.getRandomProgenitor());
    }

    @GetMapping(value = "chapters/random-gspurity", produces = "application/json")
    public Map<String, String> getRandomGspurity() {
        return Map.of("value", chapterService.getRandomGsPurity());
    }

    @GetMapping(value = "chapters/random-demeanour", produces = "application/json")
    public Map<String, String> getRandomDemeanour() {
        return Map.of("value", chapterService.getRandomDemeanour());
    }

    @GetMapping(value = "chapters/random-figure", produces = "application/json")
    public Map<String, String> getRandomFigure() {
        return Map.of("value", chapterService.getRandomFigure());
    }

    @GetMapping(value = "chapters/random-deeds", produces = "application/json")
    public Map<String, String> getRandomDeeds() {
        return Map.of("value", chapterService.getRandomDeeds());
    }

    @GetMapping(value = "chapters/random-beliefs", produces = "application/json")
    public Map<String, String> getRandomBeliefs() {return Map.of("value", chapterService.getRandomBeliefs());}
}