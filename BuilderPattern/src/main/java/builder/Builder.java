package builder;

import model.ModelHouseEnum;

public interface Builder {
    HouseBuilder id(Long id);
    HouseBuilder model(ModelHouseEnum model);
    HouseBuilder weight(Double weight);

    HouseBuilder height(Double height);

    HouseBuilder color (String color);

    HouseBuilder doors(Integer doors);
}
