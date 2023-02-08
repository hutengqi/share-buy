package cn.sincerity.sharebuy.controller;

import cn.sincerity.sharebuy.application.NoteApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * NoteController
 *
 * @author Ht7_Sincerity
 * @since 2022/12/27
 */
@RestController
@RequestMapping("/item")
public class NoteController {

    @Resource
    private NoteApplicationService noteApplicationService;

    @GetMapping
    private String one() {
        return noteApplicationService.one();
    }
}
