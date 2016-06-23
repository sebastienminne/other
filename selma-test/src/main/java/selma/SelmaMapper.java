package selma;

import fr.xebia.extras.selma.Mapper;

@Mapper
public interface SelmaMapper {

	BeanBo asBo(BeanDTO in);

}