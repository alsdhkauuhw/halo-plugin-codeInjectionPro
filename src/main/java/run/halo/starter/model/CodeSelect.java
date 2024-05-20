package run.halo.starter.model;

import static io.swagger.v3.oas.annotations.media.Schema.RequiredMode.REQUIRED;

import java.sql.Date;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import run.halo.app.extension.AbstractExtension;
import run.halo.app.extension.GVK;

@Data
@EqualsAndHashCode(callSuper = true)
@GVK(kind = "CodeSelect", group = "codeselect.plugin.halo.run",
    version = "v1alpha1", singular = "codeselect", plural = "codeselect")
public class CodeSelect extends AbstractExtension{
    @Schema(requiredMode = REQUIRED)
    private CodeSnippet code;
    @Data
    public static class CodeSnippet {

        @Schema(requiredMode = REQUIRED, minLength = 1)
        private String codePosition; // 代码位置（头部或尾部）

        @Schema(requiredMode = REQUIRED)
        private List<String> pages; // 需要注入的页面

        @Schema(defaultValue = "true")
        private boolean isEnabled; // 是否启用

        @Schema(requiredMode = Schema.RequiredMode.REQUIRED)
        private Date effectiveTime; // 生效时间

    }
}
