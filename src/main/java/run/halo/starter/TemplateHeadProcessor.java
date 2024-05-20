package run.halo.starter;

import java.util.List;

import org.pf4j.ExtensionPoint;
import org.thymeleaf.context.ITemplateContext;
import org.thymeleaf.model.IModel;
import org.thymeleaf.processor.element.IElementModelStructureHandler;

import reactor.core.publisher.Mono;
import run.halo.starter.model.CodeInjection;

public interface TemplateHeadProcessor extends ExtensionPoint {
    
    Mono<IModel> process(ITemplateContext context, IModel model,
        IElementModelStructureHandler structureHandler, List<CodeInjection> list);
}
