package com.zl2.itemapi;

import com.zl2.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("items-service")
public interface ItemServiceApi {
    @GetMapping("items/reduceItemsCount")
    Result reduceItemsCount(@RequestParam("id") String id, @RequestParam("buyCounts") int buyCounts);
}
