package run.halo.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CodeInjectionConfig {
    @Bean
    RouterFunction<ServerResponse> editorOptionsRouter() {
        return RouterFunctions.route()
            .POST("/code-injection",
                /* HANDLE后续添加
                 * 将处理后的内容返回
                 */
            )
            .build();
    }
}