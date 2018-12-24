package com.cfygit.webapi.feign;

import com.cfygit.webapi.interfaceInside.InsudeInterface;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "INSIDE-SERVICE")
public interface testFeign extends InsudeInterface{

}
