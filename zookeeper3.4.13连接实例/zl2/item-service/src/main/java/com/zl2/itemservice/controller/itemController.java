package com.zl2.itemservice.controller;


import com.zl2.itemapi.ItemServiceApi;
import com.zl2.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("items")
public class itemController implements ItemServiceApi {
    @Override
    @GetMapping("reduceCounts")
    public Result reduceItemsCount(@RequestParam("id") String id, @RequestParam("buyCounts") int buyCounts) {
        return  Result.success();
    }
}
