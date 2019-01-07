package com.cfygit.webapi.feign;

import com.cfygit.webapi.interfaceInside.InsudeInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "INSIDE-SERVICE",fallback = testFeignHystrix.class)
public interface testFeign extends InsudeInterface{

}
