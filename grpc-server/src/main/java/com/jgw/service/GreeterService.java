package com.jgw.service;

import com.jgw.grpc.lib.GreeterGrpc;
import com.jgw.grpc.lib.GreeterOuterClass;
import com.jgw.mapper.NbMapper;
import com.jgw.mapper.TOrderMapper;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 2:03 下午 2021/2/26
 * @desc
 */
@Slf4j
@GrpcService(GreeterOuterClass.class)
public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Resource
    private NbMapper nbMapper;

    @Resource
    private TOrderMapper tOrderMapper;

    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String message = "Hello " + request.getName();
        final GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(message);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        log.info("Returning " +message);

        //测试数据库查询
        log.info("查询到数据总数={}", nbMapper.countSum());

        //测试分表查询
        log.info("查询到最大id={}", tOrderMapper.selectMaxId());
    }
}
