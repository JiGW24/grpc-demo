package com.jgw.service;

import com.jgw.grpc.lib.GreeterGrpc;
import com.jgw.grpc.lib.GreeterOuterClass;
import io.grpc.Channel;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

/**
 * @author Willis JiGW
 * @version v1.0.0
 * @date Created on 2:05 下午 2021/2/26
 * @desc
 */
@Service
public class GrpcClientService {

    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMessage(String name) {
        GreeterGrpc.GreeterBlockingStub stub= GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply response = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().setName(name).build());
        return response.getMessage();
    }
}

