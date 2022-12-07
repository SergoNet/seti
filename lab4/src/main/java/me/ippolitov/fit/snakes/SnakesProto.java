package me.ippolitov.fit.snakes;

public final class SnakesProto {
  private SnakesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Роль узла в топологии связей узлов в пределах игры
   * </pre>
   *
   * Protobuf enum {@code snakes.NodeRole}
   */
  public enum NodeRole
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Обычный узел, лист в топологии "звезда"
     * </pre>
     *
     * <code>NORMAL = 0;</code>
     */
    NORMAL(0),
    /**
     * <pre>
     * Главный узел, центр в топологии "звезда"
     * </pre>
     *
     * <code>MASTER = 1;</code>
     */
    MASTER(1),
    /**
     * <pre>
     * Заместитель главного узла
     * </pre>
     *
     * <code>DEPUTY = 2;</code>
     */
    DEPUTY(2),
    /**
     * <pre>
     * Наблюдатель, похож на NORMAL, но не имеет змеи в статусе ALIVE, только получает обновления статуса
     * </pre>
     *
     * <code>VIEWER = 3;</code>
     */
    VIEWER(3),
    ;

    /**
     * <pre>
     * Обычный узел, лист в топологии "звезда"
     * </pre>
     *
     * <code>NORMAL = 0;</code>
     */
    public static final int NORMAL_VALUE = 0;
    /**
     * <pre>
     * Главный узел, центр в топологии "звезда"
     * </pre>
     *
     * <code>MASTER = 1;</code>
     */
    public static final int MASTER_VALUE = 1;
    /**
     * <pre>
     * Заместитель главного узла
     * </pre>
     *
     * <code>DEPUTY = 2;</code>
     */
    public static final int DEPUTY_VALUE = 2;
    /**
     * <pre>
     * Наблюдатель, похож на NORMAL, но не имеет змеи в статусе ALIVE, только получает обновления статуса
     * </pre>
     *
     * <code>VIEWER = 3;</code>
     */
    public static final int VIEWER_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NodeRole valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static NodeRole forNumber(int value) {
      switch (value) {
        case 0: return NORMAL;
        case 1: return MASTER;
        case 2: return DEPUTY;
        case 3: return VIEWER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<NodeRole>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        NodeRole> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NodeRole>() {
            public NodeRole findValueByNumber(int number) {
              return NodeRole.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return me.ippolitov.fit.snakes.SnakesProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final NodeRole[] VALUES = values();

    public static NodeRole valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private NodeRole(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:snakes.NodeRole)
  }

  /**
   * <pre>
   * Тип игрока
   * </pre>
   *
   * Protobuf enum {@code snakes.PlayerType}
   */
  public enum PlayerType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Живой пользователь
     * </pre>
     *
     * <code>HUMAN = 0;</code>
     */
    HUMAN(0),
    /**
     * <pre>
     * Робот, управляет своей змеёй с помощью алгоритма (вне задачи, для желающих)
     * </pre>
     *
     * <code>ROBOT = 1;</code>
     */
    ROBOT(1),
    ;

    /**
     * <pre>
     * Живой пользователь
     * </pre>
     *
     * <code>HUMAN = 0;</code>
     */
    public static final int HUMAN_VALUE = 0;
    /**
     * <pre>
     * Робот, управляет своей змеёй с помощью алгоритма (вне задачи, для желающих)
     * </pre>
     *
     * <code>ROBOT = 1;</code>
     */
    public static final int ROBOT_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PlayerType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlayerType forNumber(int value) {
      switch (value) {
        case 0: return HUMAN;
        case 1: return ROBOT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlayerType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlayerType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlayerType>() {
            public PlayerType findValueByNumber(int number) {
              return PlayerType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return me.ippolitov.fit.snakes.SnakesProto.getDescriptor().getEnumTypes().get(1);
    }

    private static final PlayerType[] VALUES = values();

    public static PlayerType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PlayerType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:snakes.PlayerType)
  }

  /**
   * Protobuf enum {@code snakes.Direction}
   */
  public enum Direction
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Вверх (в отрицательном направлении оси y)
     * </pre>
     *
     * <code>UP = 1;</code>
     */
    UP(1),
    /**
     * <pre>
     * Вниз (в положительном направлении оси y)
     * </pre>
     *
     * <code>DOWN = 2;</code>
     */
    DOWN(2),
    /**
     * <pre>
     * Влево (в отрицательном направлении оси x)
     * </pre>
     *
     * <code>LEFT = 3;</code>
     */
    LEFT(3),
    /**
     * <pre>
     * Вправо (в положительном направлении оси x)
     * </pre>
     *
     * <code>RIGHT = 4;</code>
     */
    RIGHT(4),
    ;

    /**
     * <pre>
     * Вверх (в отрицательном направлении оси y)
     * </pre>
     *
     * <code>UP = 1;</code>
     */
    public static final int UP_VALUE = 1;
    /**
     * <pre>
     * Вниз (в положительном направлении оси y)
     * </pre>
     *
     * <code>DOWN = 2;</code>
     */
    public static final int DOWN_VALUE = 2;
    /**
     * <pre>
     * Влево (в отрицательном направлении оси x)
     * </pre>
     *
     * <code>LEFT = 3;</code>
     */
    public static final int LEFT_VALUE = 3;
    /**
     * <pre>
     * Вправо (в положительном направлении оси x)
     * </pre>
     *
     * <code>RIGHT = 4;</code>
     */
    public static final int RIGHT_VALUE = 4;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Direction valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Direction forNumber(int value) {
      switch (value) {
        case 1: return UP;
        case 2: return DOWN;
        case 3: return LEFT;
        case 4: return RIGHT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Direction>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Direction> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Direction>() {
            public Direction findValueByNumber(int number) {
              return Direction.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return me.ippolitov.fit.snakes.SnakesProto.getDescriptor().getEnumTypes().get(2);
    }

    private static final Direction[] VALUES = values();

    public static Direction valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Direction(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:snakes.Direction)
  }

  public interface GamePlayerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:snakes.GamePlayer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Имя игрока (для отображения в интерфейсе)
     * </pre>
     *
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * Имя игрока (для отображения в интерфейсе)
     * </pre>
     *
     * <code>required string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * Имя игрока (для отображения в интерфейсе)
     * </pre>
     *
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * Уникальный идентификатор игрока в пределах игры
     * </pre>
     *
     * <code>required int32 id = 2;</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <pre>
     * Уникальный идентификатор игрока в пределах игры
     * </pre>
     *
     * <code>required int32 id = 2;</code>
     * @return The id.
     */
    int getId();

    /**
     * <pre>
     * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
     * </pre>
     *
     * <code>required string ip_address = 3;</code>
     * @return Whether the ipAddress field is set.
     */
    boolean hasIpAddress();
    /**
     * <pre>
     * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
     * </pre>
     *
     * <code>required string ip_address = 3;</code>
     * @return The ipAddress.
     */
    java.lang.String getIpAddress();
    /**
     * <pre>
     * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
     * </pre>
     *
     * <code>required string ip_address = 3;</code>
     * @return The bytes for ipAddress.
     */
    com.google.protobuf.ByteString
        getIpAddressBytes();

    /**
     * <pre>
     * Порт UDP-сокета игрока
     * </pre>
     *
     * <code>required int32 port = 4;</code>
     * @return Whether the port field is set.
     */
    boolean hasPort();
    /**
     * <pre>
     * Порт UDP-сокета игрока
     * </pre>
     *
     * <code>required int32 port = 4;</code>
     * @return The port.
     */
    int getPort();

    /**
     * <pre>
     * Роль узла в топологии
     * </pre>
     *
     * <code>required .snakes.NodeRole role = 5;</code>
     * @return Whether the role field is set.
     */
    boolean hasRole();
    /**
     * <pre>
     * Роль узла в топологии
     * </pre>
     *
     * <code>required .snakes.NodeRole role = 5;</code>
     * @return The role.
     */
    me.ippolitov.fit.snakes.SnakesProto.NodeRole getRole();

    /**
     * <pre>
     * Тип игрока
     * </pre>
     *
     * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
     * @return Whether the type field is set.
     */
    boolean hasType();
    /**
     * <pre>
     * Тип игрока
     * </pre>
     *
     * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
     * @return The type.
     */
    me.ippolitov.fit.snakes.SnakesProto.PlayerType getType();

    /**
     * <pre>
     * Число очков, которые набрал игрок
     * </pre>
     *
     * <code>required int32 score = 7;</code>
     * @return Whether the score field is set.
     */
    boolean hasScore();
    /**
     * <pre>
     * Число очков, которые набрал игрок
     * </pre>
     *
     * <code>required int32 score = 7;</code>
     * @return The score.
     */
    int getScore();
  }
  /**
   * <pre>
   * Игрок
   * </pre>
   *
   * Protobuf type {@code snakes.GamePlayer}
   */
  public static final class GamePlayer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:snakes.GamePlayer)
      GamePlayerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GamePlayer.newBuilder() to construct.
    private GamePlayer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GamePlayer() {
      name_ = "";
      ipAddress_ = "";
      role_ = 0;
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GamePlayer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GamePlayer(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              name_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              ipAddress_ = bs;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              port_ = input.readInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              me.ippolitov.fit.snakes.SnakesProto.NodeRole value = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                role_ = rawValue;
              }
              break;
            }
            case 48: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              me.ippolitov.fit.snakes.SnakesProto.PlayerType value = me.ippolitov.fit.snakes.SnakesProto.PlayerType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(6, rawValue);
              } else {
                bitField0_ |= 0x00000020;
                type_ = rawValue;
              }
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              score_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_snakes_GamePlayer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_snakes_GamePlayer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.ippolitov.fit.snakes.SnakesProto.GamePlayer.class, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Имя игрока (для отображения в интерфейсе)
     * </pre>
     *
     * <code>required string name = 1;</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Имя игрока (для отображения в интерфейсе)
     * </pre>
     *
     * <code>required string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Имя игрока (для отображения в интерфейсе)
     * </pre>
     *
     * <code>required string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <pre>
     * Уникальный идентификатор игрока в пределах игры
     * </pre>
     *
     * <code>required int32 id = 2;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Уникальный идентификатор игрока в пределах игры
     * </pre>
     *
     * <code>required int32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int IP_ADDRESS_FIELD_NUMBER = 3;
    private volatile java.lang.Object ipAddress_;
    /**
     * <pre>
     * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
     * </pre>
     *
     * <code>required string ip_address = 3;</code>
     * @return Whether the ipAddress field is set.
     */
    @java.lang.Override
    public boolean hasIpAddress() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
     * </pre>
     *
     * <code>required string ip_address = 3;</code>
     * @return The ipAddress.
     */
    @java.lang.Override
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          ipAddress_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
     * </pre>
     *
     * <code>required string ip_address = 3;</code>
     * @return The bytes for ipAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PORT_FIELD_NUMBER = 4;
    private int port_;
    /**
     * <pre>
     * Порт UDP-сокета игрока
     * </pre>
     *
     * <code>required int32 port = 4;</code>
     * @return Whether the port field is set.
     */
    @java.lang.Override
    public boolean hasPort() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Порт UDP-сокета игрока
     * </pre>
     *
     * <code>required int32 port = 4;</code>
     * @return The port.
     */
    @java.lang.Override
    public int getPort() {
      return port_;
    }

    public static final int ROLE_FIELD_NUMBER = 5;
    private int role_;
    /**
     * <pre>
     * Роль узла в топологии
     * </pre>
     *
     * <code>required .snakes.NodeRole role = 5;</code>
     * @return Whether the role field is set.
     */
    @java.lang.Override public boolean hasRole() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Роль узла в топологии
     * </pre>
     *
     * <code>required .snakes.NodeRole role = 5;</code>
     * @return The role.
     */
    @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.NodeRole getRole() {
      @SuppressWarnings("deprecation")
      me.ippolitov.fit.snakes.SnakesProto.NodeRole result = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(role_);
      return result == null ? me.ippolitov.fit.snakes.SnakesProto.NodeRole.NORMAL : result;
    }

    public static final int TYPE_FIELD_NUMBER = 6;
    private int type_;
    /**
     * <pre>
     * Тип игрока
     * </pre>
     *
     * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
     * @return Whether the type field is set.
     */
    @java.lang.Override public boolean hasType() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Тип игрока
     * </pre>
     *
     * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
     * @return The type.
     */
    @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.PlayerType getType() {
      @SuppressWarnings("deprecation")
      me.ippolitov.fit.snakes.SnakesProto.PlayerType result = me.ippolitov.fit.snakes.SnakesProto.PlayerType.valueOf(type_);
      return result == null ? me.ippolitov.fit.snakes.SnakesProto.PlayerType.HUMAN : result;
    }

    public static final int SCORE_FIELD_NUMBER = 7;
    private int score_;
    /**
     * <pre>
     * Число очков, которые набрал игрок
     * </pre>
     *
     * <code>required int32 score = 7;</code>
     * @return Whether the score field is set.
     */
    @java.lang.Override
    public boolean hasScore() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Число очков, которые набрал игрок
     * </pre>
     *
     * <code>required int32 score = 7;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIpAddress()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPort()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRole()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasScore()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ipAddress_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeInt32(4, port_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeEnum(5, role_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeEnum(6, type_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeInt32(7, score_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ipAddress_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, port_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, role_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, type_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, score_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GamePlayer)) {
        return super.equals(obj);
      }
      me.ippolitov.fit.snakes.SnakesProto.GamePlayer other = (me.ippolitov.fit.snakes.SnakesProto.GamePlayer) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (hasIpAddress() != other.hasIpAddress()) return false;
      if (hasIpAddress()) {
        if (!getIpAddress()
            .equals(other.getIpAddress())) return false;
      }
      if (hasPort() != other.hasPort()) return false;
      if (hasPort()) {
        if (getPort()
            != other.getPort()) return false;
      }
      if (hasRole() != other.hasRole()) return false;
      if (hasRole()) {
        if (role_ != other.role_) return false;
      }
      if (hasType() != other.hasType()) return false;
      if (hasType()) {
        if (type_ != other.type_) return false;
      }
      if (hasScore() != other.hasScore()) return false;
      if (hasScore()) {
        if (getScore()
            != other.getScore()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      if (hasIpAddress()) {
        hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getIpAddress().hashCode();
      }
      if (hasPort()) {
        hash = (37 * hash) + PORT_FIELD_NUMBER;
        hash = (53 * hash) + getPort();
      }
      if (hasRole()) {
        hash = (37 * hash) + ROLE_FIELD_NUMBER;
        hash = (53 * hash) + role_;
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
      }
      if (hasScore()) {
        hash = (37 * hash) + SCORE_FIELD_NUMBER;
        hash = (53 * hash) + getScore();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GamePlayer prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Игрок
     * </pre>
     *
     * Protobuf type {@code snakes.GamePlayer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:snakes.GamePlayer)
        me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GamePlayer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GamePlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GamePlayer.class, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder.class);
      }

      // Construct using me.ippolitov.fit.snakes.SnakesProto.GamePlayer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        ipAddress_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        port_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        role_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        score_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_snakes_GamePlayer_descriptor;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayer getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayer build() {
        me.ippolitov.fit.snakes.SnakesProto.GamePlayer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayer buildPartial() {
        me.ippolitov.fit.snakes.SnakesProto.GamePlayer result = new me.ippolitov.fit.snakes.SnakesProto.GamePlayer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.ipAddress_ = ipAddress_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.port_ = port_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.role_ = role_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          to_bitField0_ |= 0x00000020;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000040) != 0)) {
          result.score_ = score_;
          to_bitField0_ |= 0x00000040;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GamePlayer) {
          return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GamePlayer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GamePlayer other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasIpAddress()) {
          bitField0_ |= 0x00000004;
          ipAddress_ = other.ipAddress_;
          onChanged();
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        if (other.hasRole()) {
          setRole(other.getRole());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasScore()) {
          setScore(other.getScore());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        if (!hasId()) {
          return false;
        }
        if (!hasIpAddress()) {
          return false;
        }
        if (!hasPort()) {
          return false;
        }
        if (!hasRole()) {
          return false;
        }
        if (!hasScore()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        me.ippolitov.fit.snakes.SnakesProto.GamePlayer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GamePlayer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Имя игрока (для отображения в интерфейсе)
       * </pre>
       *
       * <code>required string name = 1;</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Имя игрока (для отображения в интерфейсе)
       * </pre>
       *
       * <code>required string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Имя игрока (для отображения в интерфейсе)
       * </pre>
       *
       * <code>required string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Имя игрока (для отображения в интерфейсе)
       * </pre>
       *
       * <code>required string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Имя игрока (для отображения в интерфейсе)
       * </pre>
       *
       * <code>required string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Имя игрока (для отображения в интерфейсе)
       * </pre>
       *
       * <code>required string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <pre>
       * Уникальный идентификатор игрока в пределах игры
       * </pre>
       *
       * <code>required int32 id = 2;</code>
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Уникальный идентификатор игрока в пределах игры
       * </pre>
       *
       * <code>required int32 id = 2;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <pre>
       * Уникальный идентификатор игрока в пределах игры
       * </pre>
       *
       * <code>required int32 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Уникальный идентификатор игрока в пределах игры
       * </pre>
       *
       * <code>required int32 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object ipAddress_ = "";
      /**
       * <pre>
       * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
       * </pre>
       *
       * <code>required string ip_address = 3;</code>
       * @return Whether the ipAddress field is set.
       */
      public boolean hasIpAddress() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
       * </pre>
       *
       * <code>required string ip_address = 3;</code>
       * @return The ipAddress.
       */
      public java.lang.String getIpAddress() {
        java.lang.Object ref = ipAddress_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            ipAddress_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
       * </pre>
       *
       * <code>required string ip_address = 3;</code>
       * @return The bytes for ipAddress.
       */
      public com.google.protobuf.ByteString
          getIpAddressBytes() {
        java.lang.Object ref = ipAddress_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ipAddress_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
       * </pre>
       *
       * <code>required string ip_address = 3;</code>
       * @param value The ipAddress to set.
       * @return This builder for chaining.
       */
      public Builder setIpAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        ipAddress_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
       * </pre>
       *
       * <code>required string ip_address = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearIpAddress() {
        bitField0_ = (bitField0_ & ~0x00000004);
        ipAddress_ = getDefaultInstance().getIpAddress();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * IPv4 или IPv6 адрес игрока в виде строки (отправитель не знает свой IP, поэтому указывает тут пустую строку)
       * </pre>
       *
       * <code>required string ip_address = 3;</code>
       * @param value The bytes for ipAddress to set.
       * @return This builder for chaining.
       */
      public Builder setIpAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        ipAddress_ = value;
        onChanged();
        return this;
      }

      private int port_ ;
      /**
       * <pre>
       * Порт UDP-сокета игрока
       * </pre>
       *
       * <code>required int32 port = 4;</code>
       * @return Whether the port field is set.
       */
      @java.lang.Override
      public boolean hasPort() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Порт UDP-сокета игрока
       * </pre>
       *
       * <code>required int32 port = 4;</code>
       * @return The port.
       */
      @java.lang.Override
      public int getPort() {
        return port_;
      }
      /**
       * <pre>
       * Порт UDP-сокета игрока
       * </pre>
       *
       * <code>required int32 port = 4;</code>
       * @param value The port to set.
       * @return This builder for chaining.
       */
      public Builder setPort(int value) {
        bitField0_ |= 0x00000008;
        port_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Порт UDP-сокета игрока
       * </pre>
       *
       * <code>required int32 port = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPort() {
        bitField0_ = (bitField0_ & ~0x00000008);
        port_ = 0;
        onChanged();
        return this;
      }

      private int role_ = 0;
      /**
       * <pre>
       * Роль узла в топологии
       * </pre>
       *
       * <code>required .snakes.NodeRole role = 5;</code>
       * @return Whether the role field is set.
       */
      @java.lang.Override public boolean hasRole() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Роль узла в топологии
       * </pre>
       *
       * <code>required .snakes.NodeRole role = 5;</code>
       * @return The role.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.NodeRole getRole() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.NodeRole result = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(role_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.NodeRole.NORMAL : result;
      }
      /**
       * <pre>
       * Роль узла в топологии
       * </pre>
       *
       * <code>required .snakes.NodeRole role = 5;</code>
       * @param value The role to set.
       * @return This builder for chaining.
       */
      public Builder setRole(me.ippolitov.fit.snakes.SnakesProto.NodeRole value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        role_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Роль узла в топологии
       * </pre>
       *
       * <code>required .snakes.NodeRole role = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRole() {
        bitField0_ = (bitField0_ & ~0x00000010);
        role_ = 0;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       * Тип игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
       * @return Whether the type field is set.
       */
      @java.lang.Override public boolean hasType() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * Тип игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
       * @return The type.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.PlayerType getType() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.PlayerType result = me.ippolitov.fit.snakes.SnakesProto.PlayerType.valueOf(type_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.PlayerType.HUMAN : result;
      }
      /**
       * <pre>
       * Тип игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(me.ippolitov.fit.snakes.SnakesProto.PlayerType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Тип игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType type = 6 [default = HUMAN];</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000020);
        type_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <pre>
       * Число очков, которые набрал игрок
       * </pre>
       *
       * <code>required int32 score = 7;</code>
       * @return Whether the score field is set.
       */
      @java.lang.Override
      public boolean hasScore() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Число очков, которые набрал игрок
       * </pre>
       *
       * <code>required int32 score = 7;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <pre>
       * Число очков, которые набрал игрок
       * </pre>
       *
       * <code>required int32 score = 7;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        bitField0_ |= 0x00000040;
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Число очков, которые набрал игрок
       * </pre>
       *
       * <code>required int32 score = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        bitField0_ = (bitField0_ & ~0x00000040);
        score_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:snakes.GamePlayer)
    }

    // @@protoc_insertion_point(class_scope:snakes.GamePlayer)
    private static final me.ippolitov.fit.snakes.SnakesProto.GamePlayer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GamePlayer();
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GamePlayer>
        PARSER = new com.google.protobuf.AbstractParser<GamePlayer>() {
      @java.lang.Override
      public GamePlayer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GamePlayer(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GamePlayer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GamePlayer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GamePlayer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GameConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:snakes.GameConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @return Whether the width field is set.
     */
    boolean hasWidth();
    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @return The width.
     */
    int getWidth();

    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @return Whether the height field is set.
     */
    boolean hasHeight();
    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @return The height.
     */
    int getHeight();

    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @return Whether the foodStatic field is set.
     */
    boolean hasFoodStatic();
    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @return The foodStatic.
     */
    int getFoodStatic();

    /**
     * <pre>
     * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
     * </pre>
     *
     * <code>optional float food_per_player = 4 [default = 1];</code>
     * @return Whether the foodPerPlayer field is set.
     */
    boolean hasFoodPerPlayer();
    /**
     * <pre>
     * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
     * </pre>
     *
     * <code>optional float food_per_player = 4 [default = 1];</code>
     * @return The foodPerPlayer.
     */
    float getFoodPerPlayer();

    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @return Whether the stateDelayMs field is set.
     */
    boolean hasStateDelayMs();
    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @return The stateDelayMs.
     */
    int getStateDelayMs();

    /**
     * <pre>
     * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
     * </pre>
     *
     * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
     * @return Whether the deadFoodProb field is set.
     */
    boolean hasDeadFoodProb();
    /**
     * <pre>
     * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
     * </pre>
     *
     * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
     * @return The deadFoodProb.
     */
    float getDeadFoodProb();

    /**
     * <pre>
     * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
     * @return Whether the pingDelayMs field is set.
     */
    boolean hasPingDelayMs();
    /**
     * <pre>
     * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
     * @return The pingDelayMs.
     */
    int getPingDelayMs();

    /**
     * <pre>
     * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
     * @return Whether the nodeTimeoutMs field is set.
     */
    boolean hasNodeTimeoutMs();
    /**
     * <pre>
     * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
     * @return The nodeTimeoutMs.
     */
    int getNodeTimeoutMs();
  }
  /**
   * <pre>
   * Параметры идущей игры (не должны меняться в процессе игры) 
   * </pre>
   *
   * Protobuf type {@code snakes.GameConfig}
   */
  public static final class GameConfig extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:snakes.GameConfig)
      GameConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GameConfig.newBuilder() to construct.
    private GameConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GameConfig() {
      width_ = 40;
      height_ = 30;
      foodStatic_ = 1;
      foodPerPlayer_ = 1F;
      stateDelayMs_ = 1000;
      deadFoodProb_ = 0.1F;
      pingDelayMs_ = 100;
      nodeTimeoutMs_ = 800;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GameConfig();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GameConfig(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              width_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              height_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              foodStatic_ = input.readInt32();
              break;
            }
            case 37: {
              bitField0_ |= 0x00000008;
              foodPerPlayer_ = input.readFloat();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              stateDelayMs_ = input.readInt32();
              break;
            }
            case 53: {
              bitField0_ |= 0x00000020;
              deadFoodProb_ = input.readFloat();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              pingDelayMs_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              nodeTimeoutMs_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_snakes_GameConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_snakes_GameConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.ippolitov.fit.snakes.SnakesProto.GameConfig.class, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder.class);
    }

    private int bitField0_;
    public static final int WIDTH_FIELD_NUMBER = 1;
    private int width_;
    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @return Whether the width field is set.
     */
    @java.lang.Override
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Ширина поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 width = 1 [default = 40];</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return width_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 2;
    private int height_;
    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @return Whether the height field is set.
     */
    @java.lang.Override
    public boolean hasHeight() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Высота поля в клетках (от 10 до 100)
     * </pre>
     *
     * <code>optional int32 height = 2 [default = 30];</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return height_;
    }

    public static final int FOOD_STATIC_FIELD_NUMBER = 3;
    private int foodStatic_;
    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @return Whether the foodStatic field is set.
     */
    @java.lang.Override
    public boolean hasFoodStatic() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
     * </pre>
     *
     * <code>optional int32 food_static = 3 [default = 1];</code>
     * @return The foodStatic.
     */
    @java.lang.Override
    public int getFoodStatic() {
      return foodStatic_;
    }

    public static final int FOOD_PER_PLAYER_FIELD_NUMBER = 4;
    private float foodPerPlayer_;
    /**
     * <pre>
     * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
     * </pre>
     *
     * <code>optional float food_per_player = 4 [default = 1];</code>
     * @return Whether the foodPerPlayer field is set.
     */
    @java.lang.Override
    public boolean hasFoodPerPlayer() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
     * </pre>
     *
     * <code>optional float food_per_player = 4 [default = 1];</code>
     * @return The foodPerPlayer.
     */
    @java.lang.Override
    public float getFoodPerPlayer() {
      return foodPerPlayer_;
    }

    public static final int STATE_DELAY_MS_FIELD_NUMBER = 5;
    private int stateDelayMs_;
    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @return Whether the stateDelayMs field is set.
     */
    @java.lang.Override
    public boolean hasStateDelayMs() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
     * @return The stateDelayMs.
     */
    @java.lang.Override
    public int getStateDelayMs() {
      return stateDelayMs_;
    }

    public static final int DEAD_FOOD_PROB_FIELD_NUMBER = 6;
    private float deadFoodProb_;
    /**
     * <pre>
     * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
     * </pre>
     *
     * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
     * @return Whether the deadFoodProb field is set.
     */
    @java.lang.Override
    public boolean hasDeadFoodProb() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <pre>
     * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
     * </pre>
     *
     * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
     * @return The deadFoodProb.
     */
    @java.lang.Override
    public float getDeadFoodProb() {
      return deadFoodProb_;
    }

    public static final int PING_DELAY_MS_FIELD_NUMBER = 7;
    private int pingDelayMs_;
    /**
     * <pre>
     * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
     * @return Whether the pingDelayMs field is set.
     */
    @java.lang.Override
    public boolean hasPingDelayMs() {
      return ((bitField0_ & 0x00000040) != 0);
    }
    /**
     * <pre>
     * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
     * @return The pingDelayMs.
     */
    @java.lang.Override
    public int getPingDelayMs() {
      return pingDelayMs_;
    }

    public static final int NODE_TIMEOUT_MS_FIELD_NUMBER = 8;
    private int nodeTimeoutMs_;
    /**
     * <pre>
     * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
     * @return Whether the nodeTimeoutMs field is set.
     */
    @java.lang.Override
    public boolean hasNodeTimeoutMs() {
      return ((bitField0_ & 0x00000080) != 0);
    }
    /**
     * <pre>
     * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
     * </pre>
     *
     * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
     * @return The nodeTimeoutMs.
     */
    @java.lang.Override
    public int getNodeTimeoutMs() {
      return nodeTimeoutMs_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, width_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, height_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt32(3, foodStatic_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeFloat(4, foodPerPlayer_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeInt32(5, stateDelayMs_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        output.writeFloat(6, deadFoodProb_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        output.writeInt32(7, pingDelayMs_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        output.writeInt32(8, nodeTimeoutMs_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, width_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, height_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, foodStatic_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, foodPerPlayer_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, stateDelayMs_);
      }
      if (((bitField0_ & 0x00000020) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, deadFoodProb_);
      }
      if (((bitField0_ & 0x00000040) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, pingDelayMs_);
      }
      if (((bitField0_ & 0x00000080) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, nodeTimeoutMs_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameConfig)) {
        return super.equals(obj);
      }
      me.ippolitov.fit.snakes.SnakesProto.GameConfig other = (me.ippolitov.fit.snakes.SnakesProto.GameConfig) obj;

      if (hasWidth() != other.hasWidth()) return false;
      if (hasWidth()) {
        if (getWidth()
            != other.getWidth()) return false;
      }
      if (hasHeight() != other.hasHeight()) return false;
      if (hasHeight()) {
        if (getHeight()
            != other.getHeight()) return false;
      }
      if (hasFoodStatic() != other.hasFoodStatic()) return false;
      if (hasFoodStatic()) {
        if (getFoodStatic()
            != other.getFoodStatic()) return false;
      }
      if (hasFoodPerPlayer() != other.hasFoodPerPlayer()) return false;
      if (hasFoodPerPlayer()) {
        if (java.lang.Float.floatToIntBits(getFoodPerPlayer())
            != java.lang.Float.floatToIntBits(
                other.getFoodPerPlayer())) return false;
      }
      if (hasStateDelayMs() != other.hasStateDelayMs()) return false;
      if (hasStateDelayMs()) {
        if (getStateDelayMs()
            != other.getStateDelayMs()) return false;
      }
      if (hasDeadFoodProb() != other.hasDeadFoodProb()) return false;
      if (hasDeadFoodProb()) {
        if (java.lang.Float.floatToIntBits(getDeadFoodProb())
            != java.lang.Float.floatToIntBits(
                other.getDeadFoodProb())) return false;
      }
      if (hasPingDelayMs() != other.hasPingDelayMs()) return false;
      if (hasPingDelayMs()) {
        if (getPingDelayMs()
            != other.getPingDelayMs()) return false;
      }
      if (hasNodeTimeoutMs() != other.hasNodeTimeoutMs()) return false;
      if (hasNodeTimeoutMs()) {
        if (getNodeTimeoutMs()
            != other.getNodeTimeoutMs()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasWidth()) {
        hash = (37 * hash) + WIDTH_FIELD_NUMBER;
        hash = (53 * hash) + getWidth();
      }
      if (hasHeight()) {
        hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
        hash = (53 * hash) + getHeight();
      }
      if (hasFoodStatic()) {
        hash = (37 * hash) + FOOD_STATIC_FIELD_NUMBER;
        hash = (53 * hash) + getFoodStatic();
      }
      if (hasFoodPerPlayer()) {
        hash = (37 * hash) + FOOD_PER_PLAYER_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getFoodPerPlayer());
      }
      if (hasStateDelayMs()) {
        hash = (37 * hash) + STATE_DELAY_MS_FIELD_NUMBER;
        hash = (53 * hash) + getStateDelayMs();
      }
      if (hasDeadFoodProb()) {
        hash = (37 * hash) + DEAD_FOOD_PROB_FIELD_NUMBER;
        hash = (53 * hash) + java.lang.Float.floatToIntBits(
            getDeadFoodProb());
      }
      if (hasPingDelayMs()) {
        hash = (37 * hash) + PING_DELAY_MS_FIELD_NUMBER;
        hash = (53 * hash) + getPingDelayMs();
      }
      if (hasNodeTimeoutMs()) {
        hash = (37 * hash) + NODE_TIMEOUT_MS_FIELD_NUMBER;
        hash = (53 * hash) + getNodeTimeoutMs();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameConfig prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Параметры идущей игры (не должны меняться в процессе игры) 
     * </pre>
     *
     * Protobuf type {@code snakes.GameConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:snakes.GameConfig)
        me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameConfig.class, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder.class);
      }

      // Construct using me.ippolitov.fit.snakes.SnakesProto.GameConfig.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        width_ = 40;
        bitField0_ = (bitField0_ & ~0x00000001);
        height_ = 30;
        bitField0_ = (bitField0_ & ~0x00000002);
        foodStatic_ = 1;
        bitField0_ = (bitField0_ & ~0x00000004);
        foodPerPlayer_ = 1F;
        bitField0_ = (bitField0_ & ~0x00000008);
        stateDelayMs_ = 1000;
        bitField0_ = (bitField0_ & ~0x00000010);
        deadFoodProb_ = 0.1F;
        bitField0_ = (bitField0_ & ~0x00000020);
        pingDelayMs_ = 100;
        bitField0_ = (bitField0_ & ~0x00000040);
        nodeTimeoutMs_ = 800;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_snakes_GameConfig_descriptor;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameConfig getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameConfig build() {
        me.ippolitov.fit.snakes.SnakesProto.GameConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameConfig buildPartial() {
        me.ippolitov.fit.snakes.SnakesProto.GameConfig result = new me.ippolitov.fit.snakes.SnakesProto.GameConfig(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.width_ = width_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.height_ = height_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.foodStatic_ = foodStatic_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.foodPerPlayer_ = foodPerPlayer_;
        if (((from_bitField0_ & 0x00000010) != 0)) {
          to_bitField0_ |= 0x00000010;
        }
        result.stateDelayMs_ = stateDelayMs_;
        if (((from_bitField0_ & 0x00000020) != 0)) {
          to_bitField0_ |= 0x00000020;
        }
        result.deadFoodProb_ = deadFoodProb_;
        if (((from_bitField0_ & 0x00000040) != 0)) {
          to_bitField0_ |= 0x00000040;
        }
        result.pingDelayMs_ = pingDelayMs_;
        if (((from_bitField0_ & 0x00000080) != 0)) {
          to_bitField0_ |= 0x00000080;
        }
        result.nodeTimeoutMs_ = nodeTimeoutMs_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameConfig) {
          return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameConfig other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasWidth()) {
          setWidth(other.getWidth());
        }
        if (other.hasHeight()) {
          setHeight(other.getHeight());
        }
        if (other.hasFoodStatic()) {
          setFoodStatic(other.getFoodStatic());
        }
        if (other.hasFoodPerPlayer()) {
          setFoodPerPlayer(other.getFoodPerPlayer());
        }
        if (other.hasStateDelayMs()) {
          setStateDelayMs(other.getStateDelayMs());
        }
        if (other.hasDeadFoodProb()) {
          setDeadFoodProb(other.getDeadFoodProb());
        }
        if (other.hasPingDelayMs()) {
          setPingDelayMs(other.getPingDelayMs());
        }
        if (other.hasNodeTimeoutMs()) {
          setNodeTimeoutMs(other.getNodeTimeoutMs());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        me.ippolitov.fit.snakes.SnakesProto.GameConfig parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameConfig) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int width_ = 40;
      /**
       * <pre>
       * Ширина поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 width = 1 [default = 40];</code>
       * @return Whether the width field is set.
       */
      @java.lang.Override
      public boolean hasWidth() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Ширина поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 width = 1 [default = 40];</code>
       * @return The width.
       */
      @java.lang.Override
      public int getWidth() {
        return width_;
      }
      /**
       * <pre>
       * Ширина поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 width = 1 [default = 40];</code>
       * @param value The width to set.
       * @return This builder for chaining.
       */
      public Builder setWidth(int value) {
        bitField0_ |= 0x00000001;
        width_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Ширина поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 width = 1 [default = 40];</code>
       * @return This builder for chaining.
       */
      public Builder clearWidth() {
        bitField0_ = (bitField0_ & ~0x00000001);
        width_ = 40;
        onChanged();
        return this;
      }

      private int height_ = 30;
      /**
       * <pre>
       * Высота поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 height = 2 [default = 30];</code>
       * @return Whether the height field is set.
       */
      @java.lang.Override
      public boolean hasHeight() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Высота поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 height = 2 [default = 30];</code>
       * @return The height.
       */
      @java.lang.Override
      public int getHeight() {
        return height_;
      }
      /**
       * <pre>
       * Высота поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 height = 2 [default = 30];</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(int value) {
        bitField0_ |= 0x00000002;
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Высота поля в клетках (от 10 до 100)
       * </pre>
       *
       * <code>optional int32 height = 2 [default = 30];</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        bitField0_ = (bitField0_ & ~0x00000002);
        height_ = 30;
        onChanged();
        return this;
      }

      private int foodStatic_ = 1;
      /**
       * <pre>
       * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
       * </pre>
       *
       * <code>optional int32 food_static = 3 [default = 1];</code>
       * @return Whether the foodStatic field is set.
       */
      @java.lang.Override
      public boolean hasFoodStatic() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
       * </pre>
       *
       * <code>optional int32 food_static = 3 [default = 1];</code>
       * @return The foodStatic.
       */
      @java.lang.Override
      public int getFoodStatic() {
        return foodStatic_;
      }
      /**
       * <pre>
       * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
       * </pre>
       *
       * <code>optional int32 food_static = 3 [default = 1];</code>
       * @param value The foodStatic to set.
       * @return This builder for chaining.
       */
      public Builder setFoodStatic(int value) {
        bitField0_ |= 0x00000004;
        foodStatic_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Количество клеток с едой, независимо от числа игроков (от 0 до 100)
       * </pre>
       *
       * <code>optional int32 food_static = 3 [default = 1];</code>
       * @return This builder for chaining.
       */
      public Builder clearFoodStatic() {
        bitField0_ = (bitField0_ & ~0x00000004);
        foodStatic_ = 1;
        onChanged();
        return this;
      }

      private float foodPerPlayer_ = 1F;
      /**
       * <pre>
       * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
       * </pre>
       *
       * <code>optional float food_per_player = 4 [default = 1];</code>
       * @return Whether the foodPerPlayer field is set.
       */
      @java.lang.Override
      public boolean hasFoodPerPlayer() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
       * </pre>
       *
       * <code>optional float food_per_player = 4 [default = 1];</code>
       * @return The foodPerPlayer.
       */
      @java.lang.Override
      public float getFoodPerPlayer() {
        return foodPerPlayer_;
      }
      /**
       * <pre>
       * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
       * </pre>
       *
       * <code>optional float food_per_player = 4 [default = 1];</code>
       * @param value The foodPerPlayer to set.
       * @return This builder for chaining.
       */
      public Builder setFoodPerPlayer(float value) {
        bitField0_ |= 0x00000008;
        foodPerPlayer_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Количество клеток с едой, на каждого игрока (вещественный коэффициент от 0 до 100)
       * </pre>
       *
       * <code>optional float food_per_player = 4 [default = 1];</code>
       * @return This builder for chaining.
       */
      public Builder clearFoodPerPlayer() {
        bitField0_ = (bitField0_ & ~0x00000008);
        foodPerPlayer_ = 1F;
        onChanged();
        return this;
      }

      private int stateDelayMs_ = 1000;
      /**
       * <pre>
       * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
       * @return Whether the stateDelayMs field is set.
       */
      @java.lang.Override
      public boolean hasStateDelayMs() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
       * @return The stateDelayMs.
       */
      @java.lang.Override
      public int getStateDelayMs() {
        return stateDelayMs_;
      }
      /**
       * <pre>
       * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
       * @param value The stateDelayMs to set.
       * @return This builder for chaining.
       */
      public Builder setStateDelayMs(int value) {
        bitField0_ |= 0x00000010;
        stateDelayMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Задержка между ходами (сменой состояний) в игре, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 state_delay_ms = 5 [default = 1000];</code>
       * @return This builder for chaining.
       */
      public Builder clearStateDelayMs() {
        bitField0_ = (bitField0_ & ~0x00000010);
        stateDelayMs_ = 1000;
        onChanged();
        return this;
      }

      private float deadFoodProb_ = 0.1F;
      /**
       * <pre>
       * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
       * </pre>
       *
       * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
       * @return Whether the deadFoodProb field is set.
       */
      @java.lang.Override
      public boolean hasDeadFoodProb() {
        return ((bitField0_ & 0x00000020) != 0);
      }
      /**
       * <pre>
       * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
       * </pre>
       *
       * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
       * @return The deadFoodProb.
       */
      @java.lang.Override
      public float getDeadFoodProb() {
        return deadFoodProb_;
      }
      /**
       * <pre>
       * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
       * </pre>
       *
       * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
       * @param value The deadFoodProb to set.
       * @return This builder for chaining.
       */
      public Builder setDeadFoodProb(float value) {
        bitField0_ |= 0x00000020;
        deadFoodProb_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Вероятность превращения мёртвой клетки в еду (от 0 до 1).
       * </pre>
       *
       * <code>optional float dead_food_prob = 6 [default = 0.1];</code>
       * @return This builder for chaining.
       */
      public Builder clearDeadFoodProb() {
        bitField0_ = (bitField0_ & ~0x00000020);
        deadFoodProb_ = 0.1F;
        onChanged();
        return this;
      }

      private int pingDelayMs_ = 100;
      /**
       * <pre>
       * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
       * @return Whether the pingDelayMs field is set.
       */
      @java.lang.Override
      public boolean hasPingDelayMs() {
        return ((bitField0_ & 0x00000040) != 0);
      }
      /**
       * <pre>
       * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
       * @return The pingDelayMs.
       */
      @java.lang.Override
      public int getPingDelayMs() {
        return pingDelayMs_;
      }
      /**
       * <pre>
       * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
       * @param value The pingDelayMs to set.
       * @return This builder for chaining.
       */
      public Builder setPingDelayMs(int value) {
        bitField0_ |= 0x00000040;
        pingDelayMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Задержка между отправкой ping-сообщений, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 ping_delay_ms = 7 [default = 100];</code>
       * @return This builder for chaining.
       */
      public Builder clearPingDelayMs() {
        bitField0_ = (bitField0_ & ~0x00000040);
        pingDelayMs_ = 100;
        onChanged();
        return this;
      }

      private int nodeTimeoutMs_ = 800;
      /**
       * <pre>
       * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
       * @return Whether the nodeTimeoutMs field is set.
       */
      @java.lang.Override
      public boolean hasNodeTimeoutMs() {
        return ((bitField0_ & 0x00000080) != 0);
      }
      /**
       * <pre>
       * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
       * @return The nodeTimeoutMs.
       */
      @java.lang.Override
      public int getNodeTimeoutMs() {
        return nodeTimeoutMs_;
      }
      /**
       * <pre>
       * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
       * @param value The nodeTimeoutMs to set.
       * @return This builder for chaining.
       */
      public Builder setNodeTimeoutMs(int value) {
        bitField0_ |= 0x00000080;
        nodeTimeoutMs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Таймаут, после которого считаем что узел-сосед отпал, в миллисекундах (от 1 до 10000)
       * </pre>
       *
       * <code>optional int32 node_timeout_ms = 8 [default = 800];</code>
       * @return This builder for chaining.
       */
      public Builder clearNodeTimeoutMs() {
        bitField0_ = (bitField0_ & ~0x00000080);
        nodeTimeoutMs_ = 800;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:snakes.GameConfig)
    }

    // @@protoc_insertion_point(class_scope:snakes.GameConfig)
    private static final me.ippolitov.fit.snakes.SnakesProto.GameConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameConfig();
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GameConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GameConfig>
        PARSER = new com.google.protobuf.AbstractParser<GameConfig>() {
      @java.lang.Override
      public GameConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameConfig(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GameConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GamePlayersOrBuilder extends
      // @@protoc_insertion_point(interface_extends:snakes.GamePlayers)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    java.util.List<me.ippolitov.fit.snakes.SnakesProto.GamePlayer> 
        getPlayersList();
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GamePlayer getPlayers(int index);
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    int getPlayersCount();
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder> 
        getPlayersOrBuilderList();
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder getPlayersOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Игроки конкретной игры 
   * </pre>
   *
   * Protobuf type {@code snakes.GamePlayers}
   */
  public static final class GamePlayers extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:snakes.GamePlayers)
      GamePlayersOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GamePlayers.newBuilder() to construct.
    private GamePlayers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GamePlayers() {
      players_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GamePlayers();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GamePlayers(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                players_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GamePlayer>();
                mutable_bitField0_ |= 0x00000001;
              }
              players_.add(
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GamePlayer.PARSER, extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          players_ = java.util.Collections.unmodifiableList(players_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_snakes_GamePlayers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_snakes_GamePlayers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.ippolitov.fit.snakes.SnakesProto.GamePlayers.class, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder.class);
    }

    public static final int PLAYERS_FIELD_NUMBER = 1;
    private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GamePlayer> players_;
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    @java.lang.Override
    public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GamePlayer> getPlayersList() {
      return players_;
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder> 
        getPlayersOrBuilderList() {
      return players_;
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    @java.lang.Override
    public int getPlayersCount() {
      return players_.size();
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GamePlayer getPlayers(int index) {
      return players_.get(index);
    }
    /**
     * <pre>
     * Список всех игроков
     * </pre>
     *
     * <code>repeated .snakes.GamePlayer players = 1;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder getPlayersOrBuilder(
        int index) {
      return players_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getPlayersCount(); i++) {
        if (!getPlayers(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < players_.size(); i++) {
        output.writeMessage(1, players_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < players_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, players_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GamePlayers)) {
        return super.equals(obj);
      }
      me.ippolitov.fit.snakes.SnakesProto.GamePlayers other = (me.ippolitov.fit.snakes.SnakesProto.GamePlayers) obj;

      if (!getPlayersList()
          .equals(other.getPlayersList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPlayersCount() > 0) {
        hash = (37 * hash) + PLAYERS_FIELD_NUMBER;
        hash = (53 * hash) + getPlayersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GamePlayers prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Игроки конкретной игры 
     * </pre>
     *
     * Protobuf type {@code snakes.GamePlayers}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:snakes.GamePlayers)
        me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GamePlayers_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GamePlayers_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GamePlayers.class, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder.class);
      }

      // Construct using me.ippolitov.fit.snakes.SnakesProto.GamePlayers.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPlayersFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playersBuilder_ == null) {
          players_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playersBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_snakes_GamePlayers_descriptor;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayers getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayers build() {
        me.ippolitov.fit.snakes.SnakesProto.GamePlayers result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayers buildPartial() {
        me.ippolitov.fit.snakes.SnakesProto.GamePlayers result = new me.ippolitov.fit.snakes.SnakesProto.GamePlayers(this);
        int from_bitField0_ = bitField0_;
        if (playersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            players_ = java.util.Collections.unmodifiableList(players_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.players_ = players_;
        } else {
          result.players_ = playersBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GamePlayers) {
          return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GamePlayers)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GamePlayers other) {
        if (other == getDefaultInstance()) return this;
        if (playersBuilder_ == null) {
          if (!other.players_.isEmpty()) {
            if (players_.isEmpty()) {
              players_ = other.players_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayersIsMutable();
              players_.addAll(other.players_);
            }
            onChanged();
          }
        } else {
          if (!other.players_.isEmpty()) {
            if (playersBuilder_.isEmpty()) {
              playersBuilder_.dispose();
              playersBuilder_ = null;
              players_ = other.players_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayersFieldBuilder() : null;
            } else {
              playersBuilder_.addAllMessages(other.players_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getPlayersCount(); i++) {
          if (!getPlayers(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        me.ippolitov.fit.snakes.SnakesProto.GamePlayers parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GamePlayers) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GamePlayer> players_ =
        java.util.Collections.emptyList();
      private void ensurePlayersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          players_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GamePlayer>(players_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GamePlayer, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder> playersBuilder_;

      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GamePlayer> getPlayersList() {
        if (playersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(players_);
        } else {
          return playersBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public int getPlayersCount() {
        if (playersBuilder_ == null) {
          return players_.size();
        } else {
          return playersBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayer getPlayers(int index) {
        if (playersBuilder_ == null) {
          return players_.get(index);
        } else {
          return playersBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder setPlayers(
          int index, me.ippolitov.fit.snakes.SnakesProto.GamePlayer value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.set(index, value);
          onChanged();
        } else {
          playersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder setPlayers(
          int index, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.set(index, builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder addPlayers(me.ippolitov.fit.snakes.SnakesProto.GamePlayer value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.add(value);
          onChanged();
        } else {
          playersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder addPlayers(
          int index, me.ippolitov.fit.snakes.SnakesProto.GamePlayer value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayersIsMutable();
          players_.add(index, value);
          onChanged();
        } else {
          playersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder addPlayers(
          me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.add(builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder addPlayers(
          int index, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder builderForValue) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.add(index, builderForValue.build());
          onChanged();
        } else {
          playersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder addAllPlayers(
          java.lang.Iterable<? extends me.ippolitov.fit.snakes.SnakesProto.GamePlayer> values) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, players_);
          onChanged();
        } else {
          playersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder clearPlayers() {
        if (playersBuilder_ == null) {
          players_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playersBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public Builder removePlayers(int index) {
        if (playersBuilder_ == null) {
          ensurePlayersIsMutable();
          players_.remove(index);
          onChanged();
        } else {
          playersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder getPlayersBuilder(
          int index) {
        return getPlayersFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder getPlayersOrBuilder(
          int index) {
        if (playersBuilder_ == null) {
          return players_.get(index);  } else {
          return playersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder> 
           getPlayersOrBuilderList() {
        if (playersBuilder_ != null) {
          return playersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(players_);
        }
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder addPlayersBuilder() {
        return getPlayersFieldBuilder().addBuilder(
            me.ippolitov.fit.snakes.SnakesProto.GamePlayer.getDefaultInstance());
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder addPlayersBuilder(
          int index) {
        return getPlayersFieldBuilder().addBuilder(
            index, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.getDefaultInstance());
      }
      /**
       * <pre>
       * Список всех игроков
       * </pre>
       *
       * <code>repeated .snakes.GamePlayer players = 1;</code>
       */
      public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder> 
           getPlayersBuilderList() {
        return getPlayersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GamePlayer, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder> 
          getPlayersFieldBuilder() {
        if (playersBuilder_ == null) {
          playersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GamePlayer, me.ippolitov.fit.snakes.SnakesProto.GamePlayer.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayerOrBuilder>(
                  players_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          players_ = null;
        }
        return playersBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:snakes.GamePlayers)
    }

    // @@protoc_insertion_point(class_scope:snakes.GamePlayers)
    private static final me.ippolitov.fit.snakes.SnakesProto.GamePlayers DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GamePlayers();
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GamePlayers getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GamePlayers>
        PARSER = new com.google.protobuf.AbstractParser<GamePlayers>() {
      @java.lang.Override
      public GamePlayers parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GamePlayers(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GamePlayers> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GamePlayers> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GamePlayers getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GameStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:snakes.GameState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int32 state_order = 1;</code>
     * @return Whether the stateOrder field is set.
     */
    boolean hasStateOrder();
    /**
     * <pre>
     * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int32 state_order = 1;</code>
     * @return The stateOrder.
     */
    int getStateOrder();

    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake> 
        getSnakesList();
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameState.Snake getSnakes(int index);
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    int getSnakesCount();
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder> 
        getSnakesOrBuilderList();
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder getSnakesOrBuilder(
        int index);

    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> 
        getFoodsList();
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getFoods(int index);
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    int getFoodsCount();
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
        getFoodsOrBuilderList();
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder getFoodsOrBuilder(
        int index);

    /**
     * <pre>
     * Актуальнейший список игроков
     * </pre>
     *
     * <code>required .snakes.GamePlayers players = 4;</code>
     * @return Whether the players field is set.
     */
    boolean hasPlayers();
    /**
     * <pre>
     * Актуальнейший список игроков
     * </pre>
     *
     * <code>required .snakes.GamePlayers players = 4;</code>
     * @return The players.
     */
    me.ippolitov.fit.snakes.SnakesProto.GamePlayers getPlayers();
    /**
     * <pre>
     * Актуальнейший список игроков
     * </pre>
     *
     * <code>required .snakes.GamePlayers players = 4;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder getPlayersOrBuilder();

    /**
     * <pre>
     * Параметры игры
     * </pre>
     *
     * <code>required .snakes.GameConfig config = 5;</code>
     * @return Whether the config field is set.
     */
    boolean hasConfig();
    /**
     * <pre>
     * Параметры игры
     * </pre>
     *
     * <code>required .snakes.GameConfig config = 5;</code>
     * @return The config.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameConfig getConfig();
    /**
     * <pre>
     * Параметры игры
     * </pre>
     *
     * <code>required .snakes.GameConfig config = 5;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder getConfigOrBuilder();
  }
  /**
   * <pre>
   * Текущее состояние игрового поля 
   * </pre>
   *
   * Protobuf type {@code snakes.GameState}
   */
  public static final class GameState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:snakes.GameState)
      GameStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GameState.newBuilder() to construct.
    private GameState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GameState() {
      snakes_ = java.util.Collections.emptyList();
      foods_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GameState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GameState(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              stateOrder_ = input.readInt32();
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                snakes_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake>();
                mutable_bitField0_ |= 0x00000002;
              }
              snakes_.add(
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.PARSER, extensionRegistry));
              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                foods_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord>();
                mutable_bitField0_ |= 0x00000004;
              }
              foods_.add(
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.PARSER, extensionRegistry));
              break;
            }
            case 34: {
              me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = players_.toBuilder();
              }
              players_ = input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GamePlayers.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(players_);
                players_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 42: {
              me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = config_.toBuilder();
              }
              config_ = input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameConfig.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(config_);
                config_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          snakes_ = java.util.Collections.unmodifiableList(snakes_);
        }
        if (((mutable_bitField0_ & 0x00000004) != 0)) {
          foods_ = java.util.Collections.unmodifiableList(foods_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_snakes_GameState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_snakes_GameState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.ippolitov.fit.snakes.SnakesProto.GameState.class, me.ippolitov.fit.snakes.SnakesProto.GameState.Builder.class);
    }

    public interface CoordOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameState.Coord)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * По горизонтальной оси, положительное направление - вправо
       * </pre>
       *
       * <code>optional sint32 x = 1 [default = 0];</code>
       * @return Whether the x field is set.
       */
      boolean hasX();
      /**
       * <pre>
       * По горизонтальной оси, положительное направление - вправо
       * </pre>
       *
       * <code>optional sint32 x = 1 [default = 0];</code>
       * @return The x.
       */
      int getX();

      /**
       * <pre>
       * По вертикальной оси, положительное направление - вниз
       * </pre>
       *
       * <code>optional sint32 y = 2 [default = 0];</code>
       * @return Whether the y field is set.
       */
      boolean hasY();
      /**
       * <pre>
       * По вертикальной оси, положительное направление - вниз
       * </pre>
       *
       * <code>optional sint32 y = 2 [default = 0];</code>
       * @return The y.
       */
      int getY();
    }
    /**
     * <pre>
     * Координаты в пределах игрового поля, либо относительное смещение координат.
     * Левая верхняя клетка поля имеет координаты (x=0, y=0).
     * Направление смещения задаётся знаком чисел. 
     * </pre>
     *
     * Protobuf type {@code snakes.GameState.Coord}
     */
    public static final class Coord extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameState.Coord)
        CoordOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Coord.newBuilder() to construct.
      private Coord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Coord() {
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new Coord();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Coord(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                bitField0_ |= 0x00000001;
                x_ = input.readSInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                y_ = input.readSInt32();
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameState_Coord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameState_Coord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.class, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder.class);
      }

      private int bitField0_;
      public static final int X_FIELD_NUMBER = 1;
      private int x_;
      /**
       * <pre>
       * По горизонтальной оси, положительное направление - вправо
       * </pre>
       *
       * <code>optional sint32 x = 1 [default = 0];</code>
       * @return Whether the x field is set.
       */
      @java.lang.Override
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * По горизонтальной оси, положительное направление - вправо
       * </pre>
       *
       * <code>optional sint32 x = 1 [default = 0];</code>
       * @return The x.
       */
      @java.lang.Override
      public int getX() {
        return x_;
      }

      public static final int Y_FIELD_NUMBER = 2;
      private int y_;
      /**
       * <pre>
       * По вертикальной оси, положительное направление - вниз
       * </pre>
       *
       * <code>optional sint32 y = 2 [default = 0];</code>
       * @return Whether the y field is set.
       */
      @java.lang.Override
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * По вертикальной оси, положительное направление - вниз
       * </pre>
       *
       * <code>optional sint32 y = 2 [default = 0];</code>
       * @return The y.
       */
      @java.lang.Override
      public int getY() {
        return y_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeSInt32(1, x_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeSInt32(2, y_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeSInt32Size(1, x_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeSInt32Size(2, y_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameState.Coord)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameState.Coord other = (me.ippolitov.fit.snakes.SnakesProto.GameState.Coord) obj;

        if (hasX() != other.hasX()) return false;
        if (hasX()) {
          if (getX()
              != other.getX()) return false;
        }
        if (hasY() != other.hasY()) return false;
        if (hasY()) {
          if (getY()
              != other.getY()) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasX()) {
          hash = (37 * hash) + X_FIELD_NUMBER;
          hash = (53 * hash) + getX();
        }
        if (hasY()) {
          hash = (37 * hash) + Y_FIELD_NUMBER;
          hash = (53 * hash) + getY();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameState.Coord prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Координаты в пределах игрового поля, либо относительное смещение координат.
       * Левая верхняя клетка поля имеет координаты (x=0, y=0).
       * Направление смещения задаётся знаком чисел. 
       * </pre>
       *
       * Protobuf type {@code snakes.GameState.Coord}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameState.Coord)
          me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameState_Coord_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameState_Coord_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.class, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          x_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          y_ = 0;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameState_Coord_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord build() {
          me.ippolitov.fit.snakes.SnakesProto.GameState.Coord result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameState.Coord result = new me.ippolitov.fit.snakes.SnakesProto.GameState.Coord(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.x_ = x_;
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            result.y_ = y_;
            to_bitField0_ |= 0x00000002;
          }
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameState.Coord) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameState.Coord)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameState.Coord other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasX()) {
            setX(other.getX());
          }
          if (other.hasY()) {
            setY(other.getY());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameState.Coord parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameState.Coord) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private int x_ ;
        /**
         * <pre>
         * По горизонтальной оси, положительное направление - вправо
         * </pre>
         *
         * <code>optional sint32 x = 1 [default = 0];</code>
         * @return Whether the x field is set.
         */
        @java.lang.Override
        public boolean hasX() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * По горизонтальной оси, положительное направление - вправо
         * </pre>
         *
         * <code>optional sint32 x = 1 [default = 0];</code>
         * @return The x.
         */
        @java.lang.Override
        public int getX() {
          return x_;
        }
        /**
         * <pre>
         * По горизонтальной оси, положительное направление - вправо
         * </pre>
         *
         * <code>optional sint32 x = 1 [default = 0];</code>
         * @param value The x to set.
         * @return This builder for chaining.
         */
        public Builder setX(int value) {
          bitField0_ |= 0x00000001;
          x_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * По горизонтальной оси, положительное направление - вправо
         * </pre>
         *
         * <code>optional sint32 x = 1 [default = 0];</code>
         * @return This builder for chaining.
         */
        public Builder clearX() {
          bitField0_ = (bitField0_ & ~0x00000001);
          x_ = 0;
          onChanged();
          return this;
        }

        private int y_ ;
        /**
         * <pre>
         * По вертикальной оси, положительное направление - вниз
         * </pre>
         *
         * <code>optional sint32 y = 2 [default = 0];</code>
         * @return Whether the y field is set.
         */
        @java.lang.Override
        public boolean hasY() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <pre>
         * По вертикальной оси, положительное направление - вниз
         * </pre>
         *
         * <code>optional sint32 y = 2 [default = 0];</code>
         * @return The y.
         */
        @java.lang.Override
        public int getY() {
          return y_;
        }
        /**
         * <pre>
         * По вертикальной оси, положительное направление - вниз
         * </pre>
         *
         * <code>optional sint32 y = 2 [default = 0];</code>
         * @param value The y to set.
         * @return This builder for chaining.
         */
        public Builder setY(int value) {
          bitField0_ |= 0x00000002;
          y_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * По вертикальной оси, положительное направление - вниз
         * </pre>
         *
         * <code>optional sint32 y = 2 [default = 0];</code>
         * @return This builder for chaining.
         */
        public Builder clearY() {
          bitField0_ = (bitField0_ & ~0x00000002);
          y_ = 0;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameState.Coord)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameState.Coord)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameState.Coord DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameState.Coord();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<Coord>
          PARSER = new com.google.protobuf.AbstractParser<Coord>() {
        @java.lang.Override
        public Coord parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Coord(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<Coord> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Coord> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface SnakeOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameState.Snake)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * Идентификатор игрока-владельца змеи, см. GamePlayer.id
       * </pre>
       *
       * <code>required int32 player_id = 1;</code>
       * @return Whether the playerId field is set.
       */
      boolean hasPlayerId();
      /**
       * <pre>
       * Идентификатор игрока-владельца змеи, см. GamePlayer.id
       * </pre>
       *
       * <code>required int32 player_id = 1;</code>
       * @return The playerId.
       */
      int getPlayerId();

      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> 
          getPointsList();
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getPoints(int index);
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      int getPointsCount();
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
          getPointsOrBuilderList();
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder getPointsOrBuilder(
          int index);

      /**
       * <pre>
       * статус змеи в игре
       * </pre>
       *
       * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
       * @return Whether the state field is set.
       */
      boolean hasState();
      /**
       * <pre>
       * статус змеи в игре
       * </pre>
       *
       * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
       * @return The state.
       */
      me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState getState();

      /**
       * <pre>
       * Направление, в котором повёрнута голова змейки в текущий момент
       * </pre>
       *
       * <code>required .snakes.Direction head_direction = 4;</code>
       * @return Whether the headDirection field is set.
       */
      boolean hasHeadDirection();
      /**
       * <pre>
       * Направление, в котором повёрнута голова змейки в текущий момент
       * </pre>
       *
       * <code>required .snakes.Direction head_direction = 4;</code>
       * @return The headDirection.
       */
      me.ippolitov.fit.snakes.SnakesProto.Direction getHeadDirection();
    }
    /**
     * <pre>
     * Змея
     * </pre>
     *
     * Protobuf type {@code snakes.GameState.Snake}
     */
    public static final class Snake extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameState.Snake)
        SnakeOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use Snake.newBuilder() to construct.
      private Snake(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private Snake() {
        points_ = java.util.Collections.emptyList();
        state_ = 0;
        headDirection_ = 1;
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new Snake();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private Snake(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                bitField0_ |= 0x00000001;
                playerId_ = input.readInt32();
                break;
              }
              case 18: {
                if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                  points_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord>();
                  mutable_bitField0_ |= 0x00000002;
                }
                points_.add(
                    input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.PARSER, extensionRegistry));
                break;
              }
              case 24: {
                int rawValue = input.readEnum();
                  @SuppressWarnings("deprecation")
                me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState value = me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(3, rawValue);
                } else {
                  bitField0_ |= 0x00000002;
                  state_ = rawValue;
                }
                break;
              }
              case 32: {
                int rawValue = input.readEnum();
                  @SuppressWarnings("deprecation")
                me.ippolitov.fit.snakes.SnakesProto.Direction value = me.ippolitov.fit.snakes.SnakesProto.Direction.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(4, rawValue);
                } else {
                  bitField0_ |= 0x00000004;
                  headDirection_ = rawValue;
                }
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          if (((mutable_bitField0_ & 0x00000002) != 0)) {
            points_ = java.util.Collections.unmodifiableList(points_);
          }
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameState_Snake_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameState_Snake_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.class, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder.class);
      }

      /**
       * <pre>
       * Статус змеи в игре
       * </pre>
       *
       * Protobuf enum {@code snakes.GameState.Snake.SnakeState}
       */
      public enum SnakeState
          implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * Змея управляется игроком
         * </pre>
         *
         * <code>ALIVE = 0;</code>
         */
        ALIVE(0),
        /**
         * <pre>
         * Змея принадлежала игроку, который вышел из игры, она продолжает движение куда глаза глядят
         * </pre>
         *
         * <code>ZOMBIE = 1;</code>
         */
        ZOMBIE(1),
        ;

        /**
         * <pre>
         * Змея управляется игроком
         * </pre>
         *
         * <code>ALIVE = 0;</code>
         */
        public static final int ALIVE_VALUE = 0;
        /**
         * <pre>
         * Змея принадлежала игроку, который вышел из игры, она продолжает движение куда глаза глядят
         * </pre>
         *
         * <code>ZOMBIE = 1;</code>
         */
        public static final int ZOMBIE_VALUE = 1;


        public final int getNumber() {
          return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static SnakeState valueOf(int value) {
          return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static SnakeState forNumber(int value) {
          switch (value) {
            case 0: return ALIVE;
            case 1: return ZOMBIE;
            default: return null;
          }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<SnakeState>
            internalGetValueMap() {
          return internalValueMap;
        }
        private static final com.google.protobuf.Internal.EnumLiteMap<
            SnakeState> internalValueMap =
              new com.google.protobuf.Internal.EnumLiteMap<SnakeState>() {
                public SnakeState findValueByNumber(int number) {
                  return SnakeState.forNumber(number);
                }
              };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
            getValueDescriptor() {
          return getDescriptor().getValues().get(ordinal());
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor
            getDescriptor() {
          return me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.getDescriptor().getEnumTypes().get(0);
        }

        private static final SnakeState[] VALUES = values();

        public static SnakeState valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
          if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "EnumValueDescriptor is not for this type.");
          }
          return VALUES[desc.getIndex()];
        }

        private final int value;

        private SnakeState(int value) {
          this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:snakes.GameState.Snake.SnakeState)
      }

      private int bitField0_;
      public static final int PLAYER_ID_FIELD_NUMBER = 1;
      private int playerId_;
      /**
       * <pre>
       * Идентификатор игрока-владельца змеи, см. GamePlayer.id
       * </pre>
       *
       * <code>required int32 player_id = 1;</code>
       * @return Whether the playerId field is set.
       */
      @java.lang.Override
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Идентификатор игрока-владельца змеи, см. GamePlayer.id
       * </pre>
       *
       * <code>required int32 player_id = 1;</code>
       * @return The playerId.
       */
      @java.lang.Override
      public int getPlayerId() {
        return playerId_;
      }

      public static final int POINTS_FIELD_NUMBER = 2;
      private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> points_;
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      @java.lang.Override
      public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> getPointsList() {
        return points_;
      }
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      @java.lang.Override
      public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
          getPointsOrBuilderList() {
        return points_;
      }
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      @java.lang.Override
      public int getPointsCount() {
        return points_.size();
      }
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getPoints(int index) {
        return points_.get(index);
      }
      /**
       * <pre>
       * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
       * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
       * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord points = 2;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder getPointsOrBuilder(
          int index) {
        return points_.get(index);
      }

      public static final int STATE_FIELD_NUMBER = 3;
      private int state_;
      /**
       * <pre>
       * статус змеи в игре
       * </pre>
       *
       * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
       * @return Whether the state field is set.
       */
      @java.lang.Override public boolean hasState() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * статус змеи в игре
       * </pre>
       *
       * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
       * @return The state.
       */
      @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState getState() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState result = me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState.valueOf(state_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState.ALIVE : result;
      }

      public static final int HEAD_DIRECTION_FIELD_NUMBER = 4;
      private int headDirection_;
      /**
       * <pre>
       * Направление, в котором повёрнута голова змейки в текущий момент
       * </pre>
       *
       * <code>required .snakes.Direction head_direction = 4;</code>
       * @return Whether the headDirection field is set.
       */
      @java.lang.Override public boolean hasHeadDirection() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Направление, в котором повёрнута голова змейки в текущий момент
       * </pre>
       *
       * <code>required .snakes.Direction head_direction = 4;</code>
       * @return The headDirection.
       */
      @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.Direction getHeadDirection() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.Direction result = me.ippolitov.fit.snakes.SnakesProto.Direction.valueOf(headDirection_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.Direction.UP : result;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasPlayerId()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!hasState()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!hasHeadDirection()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeInt32(1, playerId_);
        }
        for (int i = 0; i < points_.size(); i++) {
          output.writeMessage(2, points_.get(i));
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeEnum(3, state_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          output.writeEnum(4, headDirection_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeInt32Size(1, playerId_);
        }
        for (int i = 0; i < points_.size(); i++) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, points_.get(i));
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(3, state_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(4, headDirection_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameState.Snake)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameState.Snake other = (me.ippolitov.fit.snakes.SnakesProto.GameState.Snake) obj;

        if (hasPlayerId() != other.hasPlayerId()) return false;
        if (hasPlayerId()) {
          if (getPlayerId()
              != other.getPlayerId()) return false;
        }
        if (!getPointsList()
            .equals(other.getPointsList())) return false;
        if (hasState() != other.hasState()) return false;
        if (hasState()) {
          if (state_ != other.state_) return false;
        }
        if (hasHeadDirection() != other.hasHeadDirection()) return false;
        if (hasHeadDirection()) {
          if (headDirection_ != other.headDirection_) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasPlayerId()) {
          hash = (37 * hash) + PLAYER_ID_FIELD_NUMBER;
          hash = (53 * hash) + getPlayerId();
        }
        if (getPointsCount() > 0) {
          hash = (37 * hash) + POINTS_FIELD_NUMBER;
          hash = (53 * hash) + getPointsList().hashCode();
        }
        if (hasState()) {
          hash = (37 * hash) + STATE_FIELD_NUMBER;
          hash = (53 * hash) + state_;
        }
        if (hasHeadDirection()) {
          hash = (37 * hash) + HEAD_DIRECTION_FIELD_NUMBER;
          hash = (53 * hash) + headDirection_;
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameState.Snake prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Змея
       * </pre>
       *
       * Protobuf type {@code snakes.GameState.Snake}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameState.Snake)
          me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameState_Snake_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameState_Snake_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.class, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
            getPointsFieldBuilder();
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          playerId_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          if (pointsBuilder_ == null) {
            points_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            pointsBuilder_.clear();
          }
          state_ = 0;
          bitField0_ = (bitField0_ & ~0x00000004);
          headDirection_ = 1;
          bitField0_ = (bitField0_ & ~0x00000008);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameState_Snake_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake build() {
          me.ippolitov.fit.snakes.SnakesProto.GameState.Snake result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameState.Snake result = new me.ippolitov.fit.snakes.SnakesProto.GameState.Snake(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            result.playerId_ = playerId_;
            to_bitField0_ |= 0x00000001;
          }
          if (pointsBuilder_ == null) {
            if (((bitField0_ & 0x00000002) != 0)) {
              points_ = java.util.Collections.unmodifiableList(points_);
              bitField0_ = (bitField0_ & ~0x00000002);
            }
            result.points_ = points_;
          } else {
            result.points_ = pointsBuilder_.build();
          }
          if (((from_bitField0_ & 0x00000004) != 0)) {
            to_bitField0_ |= 0x00000002;
          }
          result.state_ = state_;
          if (((from_bitField0_ & 0x00000008) != 0)) {
            to_bitField0_ |= 0x00000004;
          }
          result.headDirection_ = headDirection_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameState.Snake) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameState.Snake)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameState.Snake other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasPlayerId()) {
            setPlayerId(other.getPlayerId());
          }
          if (pointsBuilder_ == null) {
            if (!other.points_.isEmpty()) {
              if (points_.isEmpty()) {
                points_ = other.points_;
                bitField0_ = (bitField0_ & ~0x00000002);
              } else {
                ensurePointsIsMutable();
                points_.addAll(other.points_);
              }
              onChanged();
            }
          } else {
            if (!other.points_.isEmpty()) {
              if (pointsBuilder_.isEmpty()) {
                pointsBuilder_.dispose();
                pointsBuilder_ = null;
                points_ = other.points_;
                bitField0_ = (bitField0_ & ~0x00000002);
                pointsBuilder_ = 
                  com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                     getPointsFieldBuilder() : null;
              } else {
                pointsBuilder_.addAllMessages(other.points_);
              }
            }
          }
          if (other.hasState()) {
            setState(other.getState());
          }
          if (other.hasHeadDirection()) {
            setHeadDirection(other.getHeadDirection());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasPlayerId()) {
            return false;
          }
          if (!hasState()) {
            return false;
          }
          if (!hasHeadDirection()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameState.Snake parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameState.Snake) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private int playerId_ ;
        /**
         * <pre>
         * Идентификатор игрока-владельца змеи, см. GamePlayer.id
         * </pre>
         *
         * <code>required int32 player_id = 1;</code>
         * @return Whether the playerId field is set.
         */
        @java.lang.Override
        public boolean hasPlayerId() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Идентификатор игрока-владельца змеи, см. GamePlayer.id
         * </pre>
         *
         * <code>required int32 player_id = 1;</code>
         * @return The playerId.
         */
        @java.lang.Override
        public int getPlayerId() {
          return playerId_;
        }
        /**
         * <pre>
         * Идентификатор игрока-владельца змеи, см. GamePlayer.id
         * </pre>
         *
         * <code>required int32 player_id = 1;</code>
         * @param value The playerId to set.
         * @return This builder for chaining.
         */
        public Builder setPlayerId(int value) {
          bitField0_ |= 0x00000001;
          playerId_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Идентификатор игрока-владельца змеи, см. GamePlayer.id
         * </pre>
         *
         * <code>required int32 player_id = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearPlayerId() {
          bitField0_ = (bitField0_ & ~0x00000001);
          playerId_ = 0;
          onChanged();
          return this;
        }

        private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> points_ =
          java.util.Collections.emptyList();
        private void ensurePointsIsMutable() {
          if (!((bitField0_ & 0x00000002) != 0)) {
            points_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord>(points_);
            bitField0_ |= 0x00000002;
           }
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GameState.Coord, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> pointsBuilder_;

        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> getPointsList() {
          if (pointsBuilder_ == null) {
            return java.util.Collections.unmodifiableList(points_);
          } else {
            return pointsBuilder_.getMessageList();
          }
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public int getPointsCount() {
          if (pointsBuilder_ == null) {
            return points_.size();
          } else {
            return pointsBuilder_.getCount();
          }
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getPoints(int index) {
          if (pointsBuilder_ == null) {
            return points_.get(index);
          } else {
            return pointsBuilder_.getMessage(index);
          }
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder setPoints(
            int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord value) {
          if (pointsBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensurePointsIsMutable();
            points_.set(index, value);
            onChanged();
          } else {
            pointsBuilder_.setMessage(index, value);
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder setPoints(
            int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder builderForValue) {
          if (pointsBuilder_ == null) {
            ensurePointsIsMutable();
            points_.set(index, builderForValue.build());
            onChanged();
          } else {
            pointsBuilder_.setMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder addPoints(me.ippolitov.fit.snakes.SnakesProto.GameState.Coord value) {
          if (pointsBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensurePointsIsMutable();
            points_.add(value);
            onChanged();
          } else {
            pointsBuilder_.addMessage(value);
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder addPoints(
            int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord value) {
          if (pointsBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            ensurePointsIsMutable();
            points_.add(index, value);
            onChanged();
          } else {
            pointsBuilder_.addMessage(index, value);
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder addPoints(
            me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder builderForValue) {
          if (pointsBuilder_ == null) {
            ensurePointsIsMutable();
            points_.add(builderForValue.build());
            onChanged();
          } else {
            pointsBuilder_.addMessage(builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder addPoints(
            int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder builderForValue) {
          if (pointsBuilder_ == null) {
            ensurePointsIsMutable();
            points_.add(index, builderForValue.build());
            onChanged();
          } else {
            pointsBuilder_.addMessage(index, builderForValue.build());
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder addAllPoints(
            java.lang.Iterable<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> values) {
          if (pointsBuilder_ == null) {
            ensurePointsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                values, points_);
            onChanged();
          } else {
            pointsBuilder_.addAllMessages(values);
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder clearPoints() {
          if (pointsBuilder_ == null) {
            points_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000002);
            onChanged();
          } else {
            pointsBuilder_.clear();
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public Builder removePoints(int index) {
          if (pointsBuilder_ == null) {
            ensurePointsIsMutable();
            points_.remove(index);
            onChanged();
          } else {
            pointsBuilder_.remove(index);
          }
          return this;
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder getPointsBuilder(
            int index) {
          return getPointsFieldBuilder().getBuilder(index);
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder getPointsOrBuilder(
            int index) {
          if (pointsBuilder_ == null) {
            return points_.get(index);  } else {
            return pointsBuilder_.getMessageOrBuilder(index);
          }
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
             getPointsOrBuilderList() {
          if (pointsBuilder_ != null) {
            return pointsBuilder_.getMessageOrBuilderList();
          } else {
            return java.util.Collections.unmodifiableList(points_);
          }
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder addPointsBuilder() {
          return getPointsFieldBuilder().addBuilder(
              me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.getDefaultInstance());
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder addPointsBuilder(
            int index) {
          return getPointsFieldBuilder().addBuilder(
              index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.getDefaultInstance());
        }
        /**
         * <pre>
         * Список "ключевых" точек змеи. Первая точка хранит координаты головы змеи.
         * Каждая следующая - смещение следующей "ключевой" точки относительно предыдущей,
         * в частности последняя точка хранит смещение хвоста змеи относительно предыдущей "ключевой" точки. 
         * </pre>
         *
         * <code>repeated .snakes.GameState.Coord points = 2;</code>
         */
        public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder> 
             getPointsBuilderList() {
          return getPointsFieldBuilder().getBuilderList();
        }
        private com.google.protobuf.RepeatedFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GameState.Coord, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
            getPointsFieldBuilder() {
          if (pointsBuilder_ == null) {
            pointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                me.ippolitov.fit.snakes.SnakesProto.GameState.Coord, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder>(
                    points_,
                    ((bitField0_ & 0x00000002) != 0),
                    getParentForChildren(),
                    isClean());
            points_ = null;
          }
          return pointsBuilder_;
        }

        private int state_ = 0;
        /**
         * <pre>
         * статус змеи в игре
         * </pre>
         *
         * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
         * @return Whether the state field is set.
         */
        @java.lang.Override public boolean hasState() {
          return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <pre>
         * статус змеи в игре
         * </pre>
         *
         * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
         * @return The state.
         */
        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState getState() {
          @SuppressWarnings("deprecation")
          me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState result = me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState.valueOf(state_);
          return result == null ? me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState.ALIVE : result;
        }
        /**
         * <pre>
         * статус змеи в игре
         * </pre>
         *
         * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
         * @param value The state to set.
         * @return This builder for chaining.
         */
        public Builder setState(me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.SnakeState value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000004;
          state_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * статус змеи в игре
         * </pre>
         *
         * <code>required .snakes.GameState.Snake.SnakeState state = 3 [default = ALIVE];</code>
         * @return This builder for chaining.
         */
        public Builder clearState() {
          bitField0_ = (bitField0_ & ~0x00000004);
          state_ = 0;
          onChanged();
          return this;
        }

        private int headDirection_ = 1;
        /**
         * <pre>
         * Направление, в котором повёрнута голова змейки в текущий момент
         * </pre>
         *
         * <code>required .snakes.Direction head_direction = 4;</code>
         * @return Whether the headDirection field is set.
         */
        @java.lang.Override public boolean hasHeadDirection() {
          return ((bitField0_ & 0x00000008) != 0);
        }
        /**
         * <pre>
         * Направление, в котором повёрнута голова змейки в текущий момент
         * </pre>
         *
         * <code>required .snakes.Direction head_direction = 4;</code>
         * @return The headDirection.
         */
        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.Direction getHeadDirection() {
          @SuppressWarnings("deprecation")
          me.ippolitov.fit.snakes.SnakesProto.Direction result = me.ippolitov.fit.snakes.SnakesProto.Direction.valueOf(headDirection_);
          return result == null ? me.ippolitov.fit.snakes.SnakesProto.Direction.UP : result;
        }
        /**
         * <pre>
         * Направление, в котором повёрнута голова змейки в текущий момент
         * </pre>
         *
         * <code>required .snakes.Direction head_direction = 4;</code>
         * @param value The headDirection to set.
         * @return This builder for chaining.
         */
        public Builder setHeadDirection(me.ippolitov.fit.snakes.SnakesProto.Direction value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000008;
          headDirection_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Направление, в котором повёрнута голова змейки в текущий момент
         * </pre>
         *
         * <code>required .snakes.Direction head_direction = 4;</code>
         * @return This builder for chaining.
         */
        public Builder clearHeadDirection() {
          bitField0_ = (bitField0_ & ~0x00000008);
          headDirection_ = 1;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameState.Snake)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameState.Snake)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameState.Snake DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameState.Snake();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameState.Snake getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<Snake>
          PARSER = new com.google.protobuf.AbstractParser<Snake>() {
        @java.lang.Override
        public Snake parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Snake(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<Snake> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<Snake> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    public static final int STATE_ORDER_FIELD_NUMBER = 1;
    private int stateOrder_;
    /**
     * <pre>
     * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int32 state_order = 1;</code>
     * @return Whether the stateOrder field is set.
     */
    @java.lang.Override
    public boolean hasStateOrder() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int32 state_order = 1;</code>
     * @return The stateOrder.
     */
    @java.lang.Override
    public int getStateOrder() {
      return stateOrder_;
    }

    public static final int SNAKES_FIELD_NUMBER = 2;
    private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake> snakes_;
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    @java.lang.Override
    public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake> getSnakesList() {
      return snakes_;
    }
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder> 
        getSnakesOrBuilderList() {
      return snakes_;
    }
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    @java.lang.Override
    public int getSnakesCount() {
      return snakes_.size();
    }
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake getSnakes(int index) {
      return snakes_.get(index);
    }
    /**
     * <pre>
     * Список змей
     * </pre>
     *
     * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder getSnakesOrBuilder(
        int index) {
      return snakes_.get(index);
    }

    public static final int FOODS_FIELD_NUMBER = 3;
    private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> foods_;
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    @java.lang.Override
    public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> getFoodsList() {
      return foods_;
    }
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
        getFoodsOrBuilderList() {
      return foods_;
    }
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    @java.lang.Override
    public int getFoodsCount() {
      return foods_.size();
    }
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getFoods(int index) {
      return foods_.get(index);
    }
    /**
     * <pre>
     * Список клеток с едой
     * </pre>
     *
     * <code>repeated .snakes.GameState.Coord foods = 3;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder getFoodsOrBuilder(
        int index) {
      return foods_.get(index);
    }

    public static final int PLAYERS_FIELD_NUMBER = 4;
    private me.ippolitov.fit.snakes.SnakesProto.GamePlayers players_;
    /**
     * <pre>
     * Актуальнейший список игроков
     * </pre>
     *
     * <code>required .snakes.GamePlayers players = 4;</code>
     * @return Whether the players field is set.
     */
    @java.lang.Override
    public boolean hasPlayers() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Актуальнейший список игроков
     * </pre>
     *
     * <code>required .snakes.GamePlayers players = 4;</code>
     * @return The players.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GamePlayers getPlayers() {
      return players_ == null ? me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
    }
    /**
     * <pre>
     * Актуальнейший список игроков
     * </pre>
     *
     * <code>required .snakes.GamePlayers players = 4;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder getPlayersOrBuilder() {
      return players_ == null ? me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
    }

    public static final int CONFIG_FIELD_NUMBER = 5;
    private me.ippolitov.fit.snakes.SnakesProto.GameConfig config_;
    /**
     * <pre>
     * Параметры игры
     * </pre>
     *
     * <code>required .snakes.GameConfig config = 5;</code>
     * @return Whether the config field is set.
     */
    @java.lang.Override
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Параметры игры
     * </pre>
     *
     * <code>required .snakes.GameConfig config = 5;</code>
     * @return The config.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameConfig getConfig() {
      return config_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
    }
    /**
     * <pre>
     * Параметры игры
     * </pre>
     *
     * <code>required .snakes.GameConfig config = 5;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder getConfigOrBuilder() {
      return config_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasStateOrder()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPlayers()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasConfig()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getSnakesCount(); i++) {
        if (!getSnakes(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!getPlayers().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, stateOrder_);
      }
      for (int i = 0; i < snakes_.size(); i++) {
        output.writeMessage(2, snakes_.get(i));
      }
      for (int i = 0; i < foods_.size(); i++) {
        output.writeMessage(3, foods_.get(i));
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(4, getPlayers());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(5, getConfig());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, stateOrder_);
      }
      for (int i = 0; i < snakes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, snakes_.get(i));
      }
      for (int i = 0; i < foods_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, foods_.get(i));
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getPlayers());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getConfig());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameState)) {
        return super.equals(obj);
      }
      me.ippolitov.fit.snakes.SnakesProto.GameState other = (me.ippolitov.fit.snakes.SnakesProto.GameState) obj;

      if (hasStateOrder() != other.hasStateOrder()) return false;
      if (hasStateOrder()) {
        if (getStateOrder()
            != other.getStateOrder()) return false;
      }
      if (!getSnakesList()
          .equals(other.getSnakesList())) return false;
      if (!getFoodsList()
          .equals(other.getFoodsList())) return false;
      if (hasPlayers() != other.hasPlayers()) return false;
      if (hasPlayers()) {
        if (!getPlayers()
            .equals(other.getPlayers())) return false;
      }
      if (hasConfig() != other.hasConfig()) return false;
      if (hasConfig()) {
        if (!getConfig()
            .equals(other.getConfig())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasStateOrder()) {
        hash = (37 * hash) + STATE_ORDER_FIELD_NUMBER;
        hash = (53 * hash) + getStateOrder();
      }
      if (getSnakesCount() > 0) {
        hash = (37 * hash) + SNAKES_FIELD_NUMBER;
        hash = (53 * hash) + getSnakesList().hashCode();
      }
      if (getFoodsCount() > 0) {
        hash = (37 * hash) + FOODS_FIELD_NUMBER;
        hash = (53 * hash) + getFoodsList().hashCode();
      }
      if (hasPlayers()) {
        hash = (37 * hash) + PLAYERS_FIELD_NUMBER;
        hash = (53 * hash) + getPlayers().hashCode();
      }
      if (hasConfig()) {
        hash = (37 * hash) + CONFIG_FIELD_NUMBER;
        hash = (53 * hash) + getConfig().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameState prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Текущее состояние игрового поля 
     * </pre>
     *
     * Protobuf type {@code snakes.GameState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:snakes.GameState)
        me.ippolitov.fit.snakes.SnakesProto.GameStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameState.class, me.ippolitov.fit.snakes.SnakesProto.GameState.Builder.class);
      }

      // Construct using me.ippolitov.fit.snakes.SnakesProto.GameState.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getSnakesFieldBuilder();
          getFoodsFieldBuilder();
          getPlayersFieldBuilder();
          getConfigFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stateOrder_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        if (snakesBuilder_ == null) {
          snakes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          snakesBuilder_.clear();
        }
        if (foodsBuilder_ == null) {
          foods_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          foodsBuilder_.clear();
        }
        if (playersBuilder_ == null) {
          players_ = null;
        } else {
          playersBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (configBuilder_ == null) {
          config_ = null;
        } else {
          configBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_snakes_GameState_descriptor;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState build() {
        me.ippolitov.fit.snakes.SnakesProto.GameState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState buildPartial() {
        me.ippolitov.fit.snakes.SnakesProto.GameState result = new me.ippolitov.fit.snakes.SnakesProto.GameState(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.stateOrder_ = stateOrder_;
          to_bitField0_ |= 0x00000001;
        }
        if (snakesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            snakes_ = java.util.Collections.unmodifiableList(snakes_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.snakes_ = snakes_;
        } else {
          result.snakes_ = snakesBuilder_.build();
        }
        if (foodsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            foods_ = java.util.Collections.unmodifiableList(foods_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.foods_ = foods_;
        } else {
          result.foods_ = foodsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (playersBuilder_ == null) {
            result.players_ = players_;
          } else {
            result.players_ = playersBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          if (configBuilder_ == null) {
            result.config_ = config_;
          } else {
            result.config_ = configBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameState) {
          return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameState other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasStateOrder()) {
          setStateOrder(other.getStateOrder());
        }
        if (snakesBuilder_ == null) {
          if (!other.snakes_.isEmpty()) {
            if (snakes_.isEmpty()) {
              snakes_ = other.snakes_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureSnakesIsMutable();
              snakes_.addAll(other.snakes_);
            }
            onChanged();
          }
        } else {
          if (!other.snakes_.isEmpty()) {
            if (snakesBuilder_.isEmpty()) {
              snakesBuilder_.dispose();
              snakesBuilder_ = null;
              snakes_ = other.snakes_;
              bitField0_ = (bitField0_ & ~0x00000002);
              snakesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSnakesFieldBuilder() : null;
            } else {
              snakesBuilder_.addAllMessages(other.snakes_);
            }
          }
        }
        if (foodsBuilder_ == null) {
          if (!other.foods_.isEmpty()) {
            if (foods_.isEmpty()) {
              foods_ = other.foods_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureFoodsIsMutable();
              foods_.addAll(other.foods_);
            }
            onChanged();
          }
        } else {
          if (!other.foods_.isEmpty()) {
            if (foodsBuilder_.isEmpty()) {
              foodsBuilder_.dispose();
              foodsBuilder_ = null;
              foods_ = other.foods_;
              bitField0_ = (bitField0_ & ~0x00000004);
              foodsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFoodsFieldBuilder() : null;
            } else {
              foodsBuilder_.addAllMessages(other.foods_);
            }
          }
        }
        if (other.hasPlayers()) {
          mergePlayers(other.getPlayers());
        }
        if (other.hasConfig()) {
          mergeConfig(other.getConfig());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasStateOrder()) {
          return false;
        }
        if (!hasPlayers()) {
          return false;
        }
        if (!hasConfig()) {
          return false;
        }
        for (int i = 0; i < getSnakesCount(); i++) {
          if (!getSnakes(i).isInitialized()) {
            return false;
          }
        }
        if (!getPlayers().isInitialized()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        me.ippolitov.fit.snakes.SnakesProto.GameState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int stateOrder_ ;
      /**
       * <pre>
       * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int32 state_order = 1;</code>
       * @return Whether the stateOrder field is set.
       */
      @java.lang.Override
      public boolean hasStateOrder() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int32 state_order = 1;</code>
       * @return The stateOrder.
       */
      @java.lang.Override
      public int getStateOrder() {
        return stateOrder_;
      }
      /**
       * <pre>
       * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int32 state_order = 1;</code>
       * @param value The stateOrder to set.
       * @return This builder for chaining.
       */
      public Builder setStateOrder(int value) {
        bitField0_ |= 0x00000001;
        stateOrder_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Порядковый номер состояния, уникален в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int32 state_order = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStateOrder() {
        bitField0_ = (bitField0_ & ~0x00000001);
        stateOrder_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake> snakes_ =
        java.util.Collections.emptyList();
      private void ensureSnakesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          snakes_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake>(snakes_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameState.Snake, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder> snakesBuilder_;

      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake> getSnakesList() {
        if (snakesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(snakes_);
        } else {
          return snakesBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public int getSnakesCount() {
        if (snakesBuilder_ == null) {
          return snakes_.size();
        } else {
          return snakesBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake getSnakes(int index) {
        if (snakesBuilder_ == null) {
          return snakes_.get(index);
        } else {
          return snakesBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder setSnakes(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake value) {
        if (snakesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSnakesIsMutable();
          snakes_.set(index, value);
          onChanged();
        } else {
          snakesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder setSnakes(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder builderForValue) {
        if (snakesBuilder_ == null) {
          ensureSnakesIsMutable();
          snakes_.set(index, builderForValue.build());
          onChanged();
        } else {
          snakesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder addSnakes(me.ippolitov.fit.snakes.SnakesProto.GameState.Snake value) {
        if (snakesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSnakesIsMutable();
          snakes_.add(value);
          onChanged();
        } else {
          snakesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder addSnakes(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake value) {
        if (snakesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSnakesIsMutable();
          snakes_.add(index, value);
          onChanged();
        } else {
          snakesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder addSnakes(
          me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder builderForValue) {
        if (snakesBuilder_ == null) {
          ensureSnakesIsMutable();
          snakes_.add(builderForValue.build());
          onChanged();
        } else {
          snakesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder addSnakes(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder builderForValue) {
        if (snakesBuilder_ == null) {
          ensureSnakesIsMutable();
          snakes_.add(index, builderForValue.build());
          onChanged();
        } else {
          snakesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder addAllSnakes(
          java.lang.Iterable<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.Snake> values) {
        if (snakesBuilder_ == null) {
          ensureSnakesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, snakes_);
          onChanged();
        } else {
          snakesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder clearSnakes() {
        if (snakesBuilder_ == null) {
          snakes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          snakesBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public Builder removeSnakes(int index) {
        if (snakesBuilder_ == null) {
          ensureSnakesIsMutable();
          snakes_.remove(index);
          onChanged();
        } else {
          snakesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder getSnakesBuilder(
          int index) {
        return getSnakesFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder getSnakesOrBuilder(
          int index) {
        if (snakesBuilder_ == null) {
          return snakes_.get(index);  } else {
          return snakesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder> 
           getSnakesOrBuilderList() {
        if (snakesBuilder_ != null) {
          return snakesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(snakes_);
        }
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder addSnakesBuilder() {
        return getSnakesFieldBuilder().addBuilder(
            me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.getDefaultInstance());
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder addSnakesBuilder(
          int index) {
        return getSnakesFieldBuilder().addBuilder(
            index, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.getDefaultInstance());
      }
      /**
       * <pre>
       * Список змей
       * </pre>
       *
       * <code>repeated .snakes.GameState.Snake snakes = 2;</code>
       */
      public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder> 
           getSnakesBuilderList() {
        return getSnakesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameState.Snake, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder> 
          getSnakesFieldBuilder() {
        if (snakesBuilder_ == null) {
          snakesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameState.Snake, me.ippolitov.fit.snakes.SnakesProto.GameState.Snake.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.SnakeOrBuilder>(
                  snakes_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          snakes_ = null;
        }
        return snakesBuilder_;
      }

      private java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> foods_ =
        java.util.Collections.emptyList();
      private void ensureFoodsIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          foods_ = new java.util.ArrayList<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord>(foods_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameState.Coord, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> foodsBuilder_;

      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> getFoodsList() {
        if (foodsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(foods_);
        } else {
          return foodsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public int getFoodsCount() {
        if (foodsBuilder_ == null) {
          return foods_.size();
        } else {
          return foodsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord getFoods(int index) {
        if (foodsBuilder_ == null) {
          return foods_.get(index);
        } else {
          return foodsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder setFoods(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord value) {
        if (foodsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFoodsIsMutable();
          foods_.set(index, value);
          onChanged();
        } else {
          foodsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder setFoods(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder builderForValue) {
        if (foodsBuilder_ == null) {
          ensureFoodsIsMutable();
          foods_.set(index, builderForValue.build());
          onChanged();
        } else {
          foodsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder addFoods(me.ippolitov.fit.snakes.SnakesProto.GameState.Coord value) {
        if (foodsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFoodsIsMutable();
          foods_.add(value);
          onChanged();
        } else {
          foodsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder addFoods(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord value) {
        if (foodsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFoodsIsMutable();
          foods_.add(index, value);
          onChanged();
        } else {
          foodsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder addFoods(
          me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder builderForValue) {
        if (foodsBuilder_ == null) {
          ensureFoodsIsMutable();
          foods_.add(builderForValue.build());
          onChanged();
        } else {
          foodsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder addFoods(
          int index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder builderForValue) {
        if (foodsBuilder_ == null) {
          ensureFoodsIsMutable();
          foods_.add(index, builderForValue.build());
          onChanged();
        } else {
          foodsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder addAllFoods(
          java.lang.Iterable<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.Coord> values) {
        if (foodsBuilder_ == null) {
          ensureFoodsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, foods_);
          onChanged();
        } else {
          foodsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder clearFoods() {
        if (foodsBuilder_ == null) {
          foods_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          foodsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public Builder removeFoods(int index) {
        if (foodsBuilder_ == null) {
          ensureFoodsIsMutable();
          foods_.remove(index);
          onChanged();
        } else {
          foodsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder getFoodsBuilder(
          int index) {
        return getFoodsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder getFoodsOrBuilder(
          int index) {
        if (foodsBuilder_ == null) {
          return foods_.get(index);  } else {
          return foodsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public java.util.List<? extends me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
           getFoodsOrBuilderList() {
        if (foodsBuilder_ != null) {
          return foodsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(foods_);
        }
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder addFoodsBuilder() {
        return getFoodsFieldBuilder().addBuilder(
            me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.getDefaultInstance());
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder addFoodsBuilder(
          int index) {
        return getFoodsFieldBuilder().addBuilder(
            index, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.getDefaultInstance());
      }
      /**
       * <pre>
       * Список клеток с едой
       * </pre>
       *
       * <code>repeated .snakes.GameState.Coord foods = 3;</code>
       */
      public java.util.List<me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder> 
           getFoodsBuilderList() {
        return getFoodsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameState.Coord, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder> 
          getFoodsFieldBuilder() {
        if (foodsBuilder_ == null) {
          foodsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameState.Coord, me.ippolitov.fit.snakes.SnakesProto.GameState.Coord.Builder, me.ippolitov.fit.snakes.SnakesProto.GameState.CoordOrBuilder>(
                  foods_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          foods_ = null;
        }
        return foodsBuilder_;
      }

      private me.ippolitov.fit.snakes.SnakesProto.GamePlayers players_;
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GamePlayers, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder> playersBuilder_;
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       * @return Whether the players field is set.
       */
      public boolean hasPlayers() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       * @return The players.
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayers getPlayers() {
        if (playersBuilder_ == null) {
          return players_ == null ? me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
        } else {
          return playersBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       */
      public Builder setPlayers(me.ippolitov.fit.snakes.SnakesProto.GamePlayers value) {
        if (playersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          players_ = value;
          onChanged();
        } else {
          playersBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       */
      public Builder setPlayers(
          me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder builderForValue) {
        if (playersBuilder_ == null) {
          players_ = builderForValue.build();
          onChanged();
        } else {
          playersBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       */
      public Builder mergePlayers(me.ippolitov.fit.snakes.SnakesProto.GamePlayers value) {
        if (playersBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              players_ != null &&
              players_ != me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance()) {
            players_ =
              me.ippolitov.fit.snakes.SnakesProto.GamePlayers.newBuilder(players_).mergeFrom(value).buildPartial();
          } else {
            players_ = value;
          }
          onChanged();
        } else {
          playersBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       */
      public Builder clearPlayers() {
        if (playersBuilder_ == null) {
          players_ = null;
          onChanged();
        } else {
          playersBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder getPlayersBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getPlayersFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder getPlayersOrBuilder() {
        if (playersBuilder_ != null) {
          return playersBuilder_.getMessageOrBuilder();
        } else {
          return players_ == null ?
              me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
        }
      }
      /**
       * <pre>
       * Актуальнейший список игроков
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GamePlayers, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder> 
          getPlayersFieldBuilder() {
        if (playersBuilder_ == null) {
          playersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GamePlayers, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder>(
                  getPlayers(),
                  getParentForChildren(),
                  isClean());
          players_ = null;
        }
        return playersBuilder_;
      }

      private me.ippolitov.fit.snakes.SnakesProto.GameConfig config_;
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameConfig, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder, me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder> configBuilder_;
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       * @return Whether the config field is set.
       */
      public boolean hasConfig() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       * @return The config.
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameConfig getConfig() {
        if (configBuilder_ == null) {
          return config_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
        } else {
          return configBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       */
      public Builder setConfig(me.ippolitov.fit.snakes.SnakesProto.GameConfig value) {
        if (configBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          config_ = value;
          onChanged();
        } else {
          configBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       */
      public Builder setConfig(
          me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder builderForValue) {
        if (configBuilder_ == null) {
          config_ = builderForValue.build();
          onChanged();
        } else {
          configBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       */
      public Builder mergeConfig(me.ippolitov.fit.snakes.SnakesProto.GameConfig value) {
        if (configBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0) &&
              config_ != null &&
              config_ != me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance()) {
            config_ =
              me.ippolitov.fit.snakes.SnakesProto.GameConfig.newBuilder(config_).mergeFrom(value).buildPartial();
          } else {
            config_ = value;
          }
          onChanged();
        } else {
          configBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       */
      public Builder clearConfig() {
        if (configBuilder_ == null) {
          config_ = null;
          onChanged();
        } else {
          configBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder getConfigBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getConfigFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder getConfigOrBuilder() {
        if (configBuilder_ != null) {
          return configBuilder_.getMessageOrBuilder();
        } else {
          return config_ == null ?
              me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
        }
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameConfig, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder, me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder> 
          getConfigFieldBuilder() {
        if (configBuilder_ == null) {
          configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameConfig, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder, me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder>(
                  getConfig(),
                  getParentForChildren(),
                  isClean());
          config_ = null;
        }
        return configBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:snakes.GameState)
    }

    // @@protoc_insertion_point(class_scope:snakes.GameState)
    private static final me.ippolitov.fit.snakes.SnakesProto.GameState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameState();
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GameState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GameState>
        PARSER = new com.google.protobuf.AbstractParser<GameState>() {
      @java.lang.Override
      public GameState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GameState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface GameMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:snakes.GameMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int64 msg_seq = 1;</code>
     * @return Whether the msgSeq field is set.
     */
    boolean hasMsgSeq();
    /**
     * <pre>
     * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int64 msg_seq = 1;</code>
     * @return The msgSeq.
     */
    long getMsgSeq();

    /**
     * <pre>
     * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 sender_id = 10;</code>
     * @return Whether the senderId field is set.
     */
    boolean hasSenderId();
    /**
     * <pre>
     * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 sender_id = 10;</code>
     * @return The senderId.
     */
    int getSenderId();

    /**
     * <pre>
     * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 receiver_id = 11;</code>
     * @return Whether the receiverId field is set.
     */
    boolean hasReceiverId();
    /**
     * <pre>
     * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 receiver_id = 11;</code>
     * @return The receiverId.
     */
    int getReceiverId();

    /**
     * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
     * @return Whether the ping field is set.
     */
    boolean hasPing();
    /**
     * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
     * @return The ping.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg getPing();
    /**
     * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsgOrBuilder getPingOrBuilder();

    /**
     * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
     * @return Whether the steer field is set.
     */
    boolean hasSteer();
    /**
     * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
     * @return The steer.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg getSteer();
    /**
     * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsgOrBuilder getSteerOrBuilder();

    /**
     * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
     * @return Whether the ack field is set.
     */
    boolean hasAck();
    /**
     * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
     * @return The ack.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg getAck();
    /**
     * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsgOrBuilder getAckOrBuilder();

    /**
     * <code>.snakes.GameMessage.StateMsg state = 5;</code>
     * @return Whether the state field is set.
     */
    boolean hasState();
    /**
     * <code>.snakes.GameMessage.StateMsg state = 5;</code>
     * @return The state.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg getState();
    /**
     * <code>.snakes.GameMessage.StateMsg state = 5;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsgOrBuilder getStateOrBuilder();

    /**
     * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
     * @return Whether the announcement field is set.
     */
    boolean hasAnnouncement();
    /**
     * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
     * @return The announcement.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg getAnnouncement();
    /**
     * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsgOrBuilder getAnnouncementOrBuilder();

    /**
     * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
     * @return Whether the join field is set.
     */
    boolean hasJoin();
    /**
     * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
     * @return The join.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg getJoin();
    /**
     * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsgOrBuilder getJoinOrBuilder();

    /**
     * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
     * @return Whether the error field is set.
     */
    boolean hasError();
    /**
     * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
     * @return The error.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg getError();
    /**
     * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsgOrBuilder getErrorOrBuilder();

    /**
     * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
     * @return Whether the roleChange field is set.
     */
    boolean hasRoleChange();
    /**
     * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
     * @return The roleChange.
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg getRoleChange();
    /**
     * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
     */
    me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsgOrBuilder getRoleChangeOrBuilder();

    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.TypeCase getTypeCase();
  }
  /**
   * <pre>
   * Общий формат любого сообщения
   * </pre>
   *
   * Protobuf type {@code snakes.GameMessage}
   */
  public static final class GameMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:snakes.GameMessage)
      GameMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GameMessage.newBuilder() to construct.
    private GameMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GameMessage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GameMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GameMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              msgSeq_ = input.readInt64();
              break;
            }
            case 18: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder subBuilder = null;
              if (typeCase_ == 2) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 2;
              break;
            }
            case 26: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder subBuilder = null;
              if (typeCase_ == 3) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 3;
              break;
            }
            case 34: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder subBuilder = null;
              if (typeCase_ == 4) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 4;
              break;
            }
            case 42: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder subBuilder = null;
              if (typeCase_ == 5) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 5;
              break;
            }
            case 50: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder subBuilder = null;
              if (typeCase_ == 6) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 6;
              break;
            }
            case 58: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder subBuilder = null;
              if (typeCase_ == 7) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 7;
              break;
            }
            case 66: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder subBuilder = null;
              if (typeCase_ == 8) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 8;
              break;
            }
            case 74: {
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder subBuilder = null;
              if (typeCase_ == 9) {
                subBuilder = ((me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_).toBuilder();
              }
              type_ =
                  input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 9;
              break;
            }
            case 80: {
              bitField0_ |= 0x00000002;
              senderId_ = input.readInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000004;
              receiverId_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return internal_static_snakes_GameMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return internal_static_snakes_GameMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.Builder.class);
    }

    public interface PingMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.PingMsg)
        com.google.protobuf.MessageOrBuilder {
    }
    /**
     * <pre>
     * Ничего не меняем, просто говорим что мы живы с интервалом ping_delay_ms
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.PingMsg}
     */
    public static final class PingMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.PingMsg)
        PingMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use PingMsg.newBuilder() to construct.
      private PingMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private PingMsg() {
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new PingMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private PingMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_PingMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_PingMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder.class);
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) obj;

        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Ничего не меняем, просто говорим что мы живы с интервалом ping_delay_ms
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.PingMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.PingMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_PingMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_PingMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_PingMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg(this);
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg other) {
          if (other == getDefaultInstance()) return this;
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.PingMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.PingMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<PingMsg>
          PARSER = new com.google.protobuf.AbstractParser<PingMsg>() {
        @java.lang.Override
        public PingMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PingMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<PingMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<PingMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface SteerMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.SteerMsg)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * Куда повернуть на следующем шаге
       * </pre>
       *
       * <code>required .snakes.Direction direction = 1;</code>
       * @return Whether the direction field is set.
       */
      boolean hasDirection();
      /**
       * <pre>
       * Куда повернуть на следующем шаге
       * </pre>
       *
       * <code>required .snakes.Direction direction = 1;</code>
       * @return The direction.
       */
      me.ippolitov.fit.snakes.SnakesProto.Direction getDirection();
    }
    /**
     * <pre>
     * Не-центральный игрок просит повернуть голову змеи
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.SteerMsg}
     */
    public static final class SteerMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.SteerMsg)
        SteerMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use SteerMsg.newBuilder() to construct.
      private SteerMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private SteerMsg() {
        direction_ = 1;
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new SteerMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private SteerMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                int rawValue = input.readEnum();
                  @SuppressWarnings("deprecation")
                me.ippolitov.fit.snakes.SnakesProto.Direction value = me.ippolitov.fit.snakes.SnakesProto.Direction.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(1, rawValue);
                } else {
                  bitField0_ |= 0x00000001;
                  direction_ = rawValue;
                }
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_SteerMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_SteerMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder.class);
      }

      private int bitField0_;
      public static final int DIRECTION_FIELD_NUMBER = 1;
      private int direction_;
      /**
       * <pre>
       * Куда повернуть на следующем шаге
       * </pre>
       *
       * <code>required .snakes.Direction direction = 1;</code>
       * @return Whether the direction field is set.
       */
      @java.lang.Override public boolean hasDirection() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Куда повернуть на следующем шаге
       * </pre>
       *
       * <code>required .snakes.Direction direction = 1;</code>
       * @return The direction.
       */
      @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.Direction getDirection() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.Direction result = me.ippolitov.fit.snakes.SnakesProto.Direction.valueOf(direction_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.Direction.UP : result;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasDirection()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeEnum(1, direction_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(1, direction_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) obj;

        if (hasDirection() != other.hasDirection()) return false;
        if (hasDirection()) {
          if (direction_ != other.direction_) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasDirection()) {
          hash = (37 * hash) + DIRECTION_FIELD_NUMBER;
          hash = (53 * hash) + direction_;
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Не-центральный игрок просит повернуть голову змеи
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.SteerMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.SteerMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_SteerMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_SteerMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          direction_ = 1;
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_SteerMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            to_bitField0_ |= 0x00000001;
          }
          result.direction_ = direction_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasDirection()) {
            setDirection(other.getDirection());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasDirection()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private int direction_ = 1;
        /**
         * <pre>
         * Куда повернуть на следующем шаге
         * </pre>
         *
         * <code>required .snakes.Direction direction = 1;</code>
         * @return Whether the direction field is set.
         */
        @java.lang.Override public boolean hasDirection() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Куда повернуть на следующем шаге
         * </pre>
         *
         * <code>required .snakes.Direction direction = 1;</code>
         * @return The direction.
         */
        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.Direction getDirection() {
          @SuppressWarnings("deprecation")
          me.ippolitov.fit.snakes.SnakesProto.Direction result = me.ippolitov.fit.snakes.SnakesProto.Direction.valueOf(direction_);
          return result == null ? me.ippolitov.fit.snakes.SnakesProto.Direction.UP : result;
        }
        /**
         * <pre>
         * Куда повернуть на следующем шаге
         * </pre>
         *
         * <code>required .snakes.Direction direction = 1;</code>
         * @param value The direction to set.
         * @return This builder for chaining.
         */
        public Builder setDirection(me.ippolitov.fit.snakes.SnakesProto.Direction value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          direction_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Куда повернуть на следующем шаге
         * </pre>
         *
         * <code>required .snakes.Direction direction = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearDirection() {
          bitField0_ = (bitField0_ & ~0x00000001);
          direction_ = 1;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.SteerMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.SteerMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<SteerMsg>
          PARSER = new com.google.protobuf.AbstractParser<SteerMsg>() {
        @java.lang.Override
        public SteerMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SteerMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<SteerMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<SteerMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface AckMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.AckMsg)
        com.google.protobuf.MessageOrBuilder {
    }
    /**
     * <pre>
     * Подтверждение сообщения с таким же seq
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.AckMsg}
     */
    public static final class AckMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.AckMsg)
        AckMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use AckMsg.newBuilder() to construct.
      private AckMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private AckMsg() {
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new AckMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private AckMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_AckMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_AckMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder.class);
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) obj;

        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Подтверждение сообщения с таким же seq
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.AckMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.AckMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_AckMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_AckMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_AckMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg(this);
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg other) {
          if (other == getDefaultInstance()) return this;
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.AckMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.AckMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<AckMsg>
          PARSER = new com.google.protobuf.AbstractParser<AckMsg>() {
        @java.lang.Override
        public AckMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AckMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<AckMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<AckMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface StateMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.StateMsg)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * Состояние игрового поля
       * </pre>
       *
       * <code>required .snakes.GameState state = 1;</code>
       * @return Whether the state field is set.
       */
      boolean hasState();
      /**
       * <pre>
       * Состояние игрового поля
       * </pre>
       *
       * <code>required .snakes.GameState state = 1;</code>
       * @return The state.
       */
      me.ippolitov.fit.snakes.SnakesProto.GameState getState();
      /**
       * <pre>
       * Состояние игрового поля
       * </pre>
       *
       * <code>required .snakes.GameState state = 1;</code>
       */
      me.ippolitov.fit.snakes.SnakesProto.GameStateOrBuilder getStateOrBuilder();
    }
    /**
     * <pre>
     * Центральный узел сообщает отсальным игрокам состояние игры
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.StateMsg}
     */
    public static final class StateMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.StateMsg)
        StateMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use StateMsg.newBuilder() to construct.
      private StateMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private StateMsg() {
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new StateMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private StateMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                me.ippolitov.fit.snakes.SnakesProto.GameState.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) != 0)) {
                  subBuilder = state_.toBuilder();
                }
                state_ = input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameState.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(state_);
                  state_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_StateMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_StateMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder.class);
      }

      private int bitField0_;
      public static final int STATE_FIELD_NUMBER = 1;
      private me.ippolitov.fit.snakes.SnakesProto.GameState state_;
      /**
       * <pre>
       * Состояние игрового поля
       * </pre>
       *
       * <code>required .snakes.GameState state = 1;</code>
       * @return Whether the state field is set.
       */
      @java.lang.Override
      public boolean hasState() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Состояние игрового поля
       * </pre>
       *
       * <code>required .snakes.GameState state = 1;</code>
       * @return The state.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameState getState() {
        return state_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameState.getDefaultInstance() : state_;
      }
      /**
       * <pre>
       * Состояние игрового поля
       * </pre>
       *
       * <code>required .snakes.GameState state = 1;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameStateOrBuilder getStateOrBuilder() {
        return state_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameState.getDefaultInstance() : state_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasState()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!getState().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeMessage(1, getState());
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, getState());
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) obj;

        if (hasState() != other.hasState()) return false;
        if (hasState()) {
          if (!getState()
              .equals(other.getState())) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasState()) {
          hash = (37 * hash) + STATE_FIELD_NUMBER;
          hash = (53 * hash) + getState().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Центральный узел сообщает отсальным игрокам состояние игры
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.StateMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.StateMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_StateMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_StateMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
            getStateFieldBuilder();
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          if (stateBuilder_ == null) {
            state_ = null;
          } else {
            stateBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_StateMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            if (stateBuilder_ == null) {
              result.state_ = state_;
            } else {
              result.state_ = stateBuilder_.build();
            }
            to_bitField0_ |= 0x00000001;
          }
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasState()) {
            mergeState(other.getState());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasState()) {
            return false;
          }
          if (!getState().isInitialized()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private me.ippolitov.fit.snakes.SnakesProto.GameState state_;
        private com.google.protobuf.SingleFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GameState, me.ippolitov.fit.snakes.SnakesProto.GameState.Builder, me.ippolitov.fit.snakes.SnakesProto.GameStateOrBuilder> stateBuilder_;
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         * @return Whether the state field is set.
         */
        public boolean hasState() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         * @return The state.
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameState getState() {
          if (stateBuilder_ == null) {
            return state_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameState.getDefaultInstance() : state_;
          } else {
            return stateBuilder_.getMessage();
          }
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         */
        public Builder setState(me.ippolitov.fit.snakes.SnakesProto.GameState value) {
          if (stateBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            state_ = value;
            onChanged();
          } else {
            stateBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         */
        public Builder setState(
            me.ippolitov.fit.snakes.SnakesProto.GameState.Builder builderForValue) {
          if (stateBuilder_ == null) {
            state_ = builderForValue.build();
            onChanged();
          } else {
            stateBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         */
        public Builder mergeState(me.ippolitov.fit.snakes.SnakesProto.GameState value) {
          if (stateBuilder_ == null) {
            if (((bitField0_ & 0x00000001) != 0) &&
                state_ != null &&
                state_ != me.ippolitov.fit.snakes.SnakesProto.GameState.getDefaultInstance()) {
              state_ =
                me.ippolitov.fit.snakes.SnakesProto.GameState.newBuilder(state_).mergeFrom(value).buildPartial();
            } else {
              state_ = value;
            }
            onChanged();
          } else {
            stateBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         */
        public Builder clearState() {
          if (stateBuilder_ == null) {
            state_ = null;
            onChanged();
          } else {
            stateBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameState.Builder getStateBuilder() {
          bitField0_ |= 0x00000001;
          onChanged();
          return getStateFieldBuilder().getBuilder();
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameStateOrBuilder getStateOrBuilder() {
          if (stateBuilder_ != null) {
            return stateBuilder_.getMessageOrBuilder();
          } else {
            return state_ == null ?
                me.ippolitov.fit.snakes.SnakesProto.GameState.getDefaultInstance() : state_;
          }
        }
        /**
         * <pre>
         * Состояние игрового поля
         * </pre>
         *
         * <code>required .snakes.GameState state = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GameState, me.ippolitov.fit.snakes.SnakesProto.GameState.Builder, me.ippolitov.fit.snakes.SnakesProto.GameStateOrBuilder> 
            getStateFieldBuilder() {
          if (stateBuilder_ == null) {
            stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                me.ippolitov.fit.snakes.SnakesProto.GameState, me.ippolitov.fit.snakes.SnakesProto.GameState.Builder, me.ippolitov.fit.snakes.SnakesProto.GameStateOrBuilder>(
                    getState(),
                    getParentForChildren(),
                    isClean());
            state_ = null;
          }
          return stateBuilder_;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.StateMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.StateMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<StateMsg>
          PARSER = new com.google.protobuf.AbstractParser<StateMsg>() {
        @java.lang.Override
        public StateMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StateMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<StateMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<StateMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface AnnouncementMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.AnnouncementMsg)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * Текущие игроки
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 1;</code>
       * @return Whether the players field is set.
       */
      boolean hasPlayers();
      /**
       * <pre>
       * Текущие игроки
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 1;</code>
       * @return The players.
       */
      me.ippolitov.fit.snakes.SnakesProto.GamePlayers getPlayers();
      /**
       * <pre>
       * Текущие игроки
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 1;</code>
       */
      me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder getPlayersOrBuilder();

      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 2;</code>
       * @return Whether the config field is set.
       */
      boolean hasConfig();
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 2;</code>
       * @return The config.
       */
      me.ippolitov.fit.snakes.SnakesProto.GameConfig getConfig();
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 2;</code>
       */
      me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder getConfigOrBuilder();

      /**
       * <pre>
       * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
       * </pre>
       *
       * <code>optional bool can_join = 3 [default = true];</code>
       * @return Whether the canJoin field is set.
       */
      boolean hasCanJoin();
      /**
       * <pre>
       * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
       * </pre>
       *
       * <code>optional bool can_join = 3 [default = true];</code>
       * @return The canJoin.
       */
      boolean getCanJoin();
    }
    /**
     * <pre>
     * Уведомление об идущей игре, регулярно отправляется multicast-ом
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.AnnouncementMsg}
     */
    public static final class AnnouncementMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.AnnouncementMsg)
        AnnouncementMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use AnnouncementMsg.newBuilder() to construct.
      private AnnouncementMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private AnnouncementMsg() {
        canJoin_ = true;
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new AnnouncementMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private AnnouncementMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder subBuilder = null;
                if (((bitField0_ & 0x00000001) != 0)) {
                  subBuilder = players_.toBuilder();
                }
                players_ = input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GamePlayers.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(players_);
                  players_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000001;
                break;
              }
              case 18: {
                me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder subBuilder = null;
                if (((bitField0_ & 0x00000002) != 0)) {
                  subBuilder = config_.toBuilder();
                }
                config_ = input.readMessage(me.ippolitov.fit.snakes.SnakesProto.GameConfig.PARSER, extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(config_);
                  config_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000002;
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                canJoin_ = input.readBool();
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_AnnouncementMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_AnnouncementMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder.class);
      }

      private int bitField0_;
      public static final int PLAYERS_FIELD_NUMBER = 1;
      private me.ippolitov.fit.snakes.SnakesProto.GamePlayers players_;
      /**
       * <pre>
       * Текущие игроки
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 1;</code>
       * @return Whether the players field is set.
       */
      @java.lang.Override
      public boolean hasPlayers() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Текущие игроки
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 1;</code>
       * @return The players.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayers getPlayers() {
        return players_ == null ? me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
      }
      /**
       * <pre>
       * Текущие игроки
       * </pre>
       *
       * <code>required .snakes.GamePlayers players = 1;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder getPlayersOrBuilder() {
        return players_ == null ? me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
      }

      public static final int CONFIG_FIELD_NUMBER = 2;
      private me.ippolitov.fit.snakes.SnakesProto.GameConfig config_;
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 2;</code>
       * @return Whether the config field is set.
       */
      @java.lang.Override
      public boolean hasConfig() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 2;</code>
       * @return The config.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameConfig getConfig() {
        return config_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
      }
      /**
       * <pre>
       * Параметры игры
       * </pre>
       *
       * <code>required .snakes.GameConfig config = 2;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder getConfigOrBuilder() {
        return config_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
      }

      public static final int CAN_JOIN_FIELD_NUMBER = 3;
      private boolean canJoin_;
      /**
       * <pre>
       * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
       * </pre>
       *
       * <code>optional bool can_join = 3 [default = true];</code>
       * @return Whether the canJoin field is set.
       */
      @java.lang.Override
      public boolean hasCanJoin() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
       * </pre>
       *
       * <code>optional bool can_join = 3 [default = true];</code>
       * @return The canJoin.
       */
      @java.lang.Override
      public boolean getCanJoin() {
        return canJoin_;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasPlayers()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!hasConfig()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!getPlayers().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeMessage(1, getPlayers());
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeMessage(2, getConfig());
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          output.writeBool(3, canJoin_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(1, getPlayers());
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(2, getConfig());
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBoolSize(3, canJoin_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) obj;

        if (hasPlayers() != other.hasPlayers()) return false;
        if (hasPlayers()) {
          if (!getPlayers()
              .equals(other.getPlayers())) return false;
        }
        if (hasConfig() != other.hasConfig()) return false;
        if (hasConfig()) {
          if (!getConfig()
              .equals(other.getConfig())) return false;
        }
        if (hasCanJoin() != other.hasCanJoin()) return false;
        if (hasCanJoin()) {
          if (getCanJoin()
              != other.getCanJoin()) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasPlayers()) {
          hash = (37 * hash) + PLAYERS_FIELD_NUMBER;
          hash = (53 * hash) + getPlayers().hashCode();
        }
        if (hasConfig()) {
          hash = (37 * hash) + CONFIG_FIELD_NUMBER;
          hash = (53 * hash) + getConfig().hashCode();
        }
        if (hasCanJoin()) {
          hash = (37 * hash) + CAN_JOIN_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
              getCanJoin());
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Уведомление об идущей игре, регулярно отправляется multicast-ом
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.AnnouncementMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.AnnouncementMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_AnnouncementMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_AnnouncementMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
            getPlayersFieldBuilder();
            getConfigFieldBuilder();
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          if (playersBuilder_ == null) {
            players_ = null;
          } else {
            playersBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          if (configBuilder_ == null) {
            config_ = null;
          } else {
            configBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000002);
          canJoin_ = true;
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_AnnouncementMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            if (playersBuilder_ == null) {
              result.players_ = players_;
            } else {
              result.players_ = playersBuilder_.build();
            }
            to_bitField0_ |= 0x00000001;
          }
          if (((from_bitField0_ & 0x00000002) != 0)) {
            if (configBuilder_ == null) {
              result.config_ = config_;
            } else {
              result.config_ = configBuilder_.build();
            }
            to_bitField0_ |= 0x00000002;
          }
          if (((from_bitField0_ & 0x00000004) != 0)) {
            to_bitField0_ |= 0x00000004;
          }
          result.canJoin_ = canJoin_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasPlayers()) {
            mergePlayers(other.getPlayers());
          }
          if (other.hasConfig()) {
            mergeConfig(other.getConfig());
          }
          if (other.hasCanJoin()) {
            setCanJoin(other.getCanJoin());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasPlayers()) {
            return false;
          }
          if (!hasConfig()) {
            return false;
          }
          if (!getPlayers().isInitialized()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private me.ippolitov.fit.snakes.SnakesProto.GamePlayers players_;
        private com.google.protobuf.SingleFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GamePlayers, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder> playersBuilder_;
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         * @return Whether the players field is set.
         */
        public boolean hasPlayers() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         * @return The players.
         */
        public me.ippolitov.fit.snakes.SnakesProto.GamePlayers getPlayers() {
          if (playersBuilder_ == null) {
            return players_ == null ? me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
          } else {
            return playersBuilder_.getMessage();
          }
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         */
        public Builder setPlayers(me.ippolitov.fit.snakes.SnakesProto.GamePlayers value) {
          if (playersBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            players_ = value;
            onChanged();
          } else {
            playersBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         */
        public Builder setPlayers(
            me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder builderForValue) {
          if (playersBuilder_ == null) {
            players_ = builderForValue.build();
            onChanged();
          } else {
            playersBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         */
        public Builder mergePlayers(me.ippolitov.fit.snakes.SnakesProto.GamePlayers value) {
          if (playersBuilder_ == null) {
            if (((bitField0_ & 0x00000001) != 0) &&
                players_ != null &&
                players_ != me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance()) {
              players_ =
                me.ippolitov.fit.snakes.SnakesProto.GamePlayers.newBuilder(players_).mergeFrom(value).buildPartial();
            } else {
              players_ = value;
            }
            onChanged();
          } else {
            playersBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000001;
          return this;
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         */
        public Builder clearPlayers() {
          if (playersBuilder_ == null) {
            players_ = null;
            onChanged();
          } else {
            playersBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder getPlayersBuilder() {
          bitField0_ |= 0x00000001;
          onChanged();
          return getPlayersFieldBuilder().getBuilder();
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder getPlayersOrBuilder() {
          if (playersBuilder_ != null) {
            return playersBuilder_.getMessageOrBuilder();
          } else {
            return players_ == null ?
                me.ippolitov.fit.snakes.SnakesProto.GamePlayers.getDefaultInstance() : players_;
          }
        }
        /**
         * <pre>
         * Текущие игроки
         * </pre>
         *
         * <code>required .snakes.GamePlayers players = 1;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GamePlayers, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder> 
            getPlayersFieldBuilder() {
          if (playersBuilder_ == null) {
            playersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                me.ippolitov.fit.snakes.SnakesProto.GamePlayers, me.ippolitov.fit.snakes.SnakesProto.GamePlayers.Builder, me.ippolitov.fit.snakes.SnakesProto.GamePlayersOrBuilder>(
                    getPlayers(),
                    getParentForChildren(),
                    isClean());
            players_ = null;
          }
          return playersBuilder_;
        }

        private me.ippolitov.fit.snakes.SnakesProto.GameConfig config_;
        private com.google.protobuf.SingleFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GameConfig, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder, me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder> configBuilder_;
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         * @return Whether the config field is set.
         */
        public boolean hasConfig() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         * @return The config.
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameConfig getConfig() {
          if (configBuilder_ == null) {
            return config_ == null ? me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
          } else {
            return configBuilder_.getMessage();
          }
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         */
        public Builder setConfig(me.ippolitov.fit.snakes.SnakesProto.GameConfig value) {
          if (configBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            config_ = value;
            onChanged();
          } else {
            configBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000002;
          return this;
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         */
        public Builder setConfig(
            me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder builderForValue) {
          if (configBuilder_ == null) {
            config_ = builderForValue.build();
            onChanged();
          } else {
            configBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000002;
          return this;
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         */
        public Builder mergeConfig(me.ippolitov.fit.snakes.SnakesProto.GameConfig value) {
          if (configBuilder_ == null) {
            if (((bitField0_ & 0x00000002) != 0) &&
                config_ != null &&
                config_ != me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance()) {
              config_ =
                me.ippolitov.fit.snakes.SnakesProto.GameConfig.newBuilder(config_).mergeFrom(value).buildPartial();
            } else {
              config_ = value;
            }
            onChanged();
          } else {
            configBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000002;
          return this;
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         */
        public Builder clearConfig() {
          if (configBuilder_ == null) {
            config_ = null;
            onChanged();
          } else {
            configBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder getConfigBuilder() {
          bitField0_ |= 0x00000002;
          onChanged();
          return getConfigFieldBuilder().getBuilder();
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         */
        public me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder getConfigOrBuilder() {
          if (configBuilder_ != null) {
            return configBuilder_.getMessageOrBuilder();
          } else {
            return config_ == null ?
                me.ippolitov.fit.snakes.SnakesProto.GameConfig.getDefaultInstance() : config_;
          }
        }
        /**
         * <pre>
         * Параметры игры
         * </pre>
         *
         * <code>required .snakes.GameConfig config = 2;</code>
         */
        private com.google.protobuf.SingleFieldBuilderV3<
            me.ippolitov.fit.snakes.SnakesProto.GameConfig, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder, me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder> 
            getConfigFieldBuilder() {
          if (configBuilder_ == null) {
            configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                me.ippolitov.fit.snakes.SnakesProto.GameConfig, me.ippolitov.fit.snakes.SnakesProto.GameConfig.Builder, me.ippolitov.fit.snakes.SnakesProto.GameConfigOrBuilder>(
                    getConfig(),
                    getParentForChildren(),
                    isClean());
            config_ = null;
          }
          return configBuilder_;
        }

        private boolean canJoin_ = true;
        /**
         * <pre>
         * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
         * </pre>
         *
         * <code>optional bool can_join = 3 [default = true];</code>
         * @return Whether the canJoin field is set.
         */
        @java.lang.Override
        public boolean hasCanJoin() {
          return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <pre>
         * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
         * </pre>
         *
         * <code>optional bool can_join = 3 [default = true];</code>
         * @return The canJoin.
         */
        @java.lang.Override
        public boolean getCanJoin() {
          return canJoin_;
        }
        /**
         * <pre>
         * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
         * </pre>
         *
         * <code>optional bool can_join = 3 [default = true];</code>
         * @param value The canJoin to set.
         * @return This builder for chaining.
         */
        public Builder setCanJoin(boolean value) {
          bitField0_ |= 0x00000004;
          canJoin_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Можно ли новому игроку присоединиться к игре (есть ли место на поле)
         * </pre>
         *
         * <code>optional bool can_join = 3 [default = true];</code>
         * @return This builder for chaining.
         */
        public Builder clearCanJoin() {
          bitField0_ = (bitField0_ & ~0x00000004);
          canJoin_ = true;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.AnnouncementMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.AnnouncementMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<AnnouncementMsg>
          PARSER = new com.google.protobuf.AbstractParser<AnnouncementMsg>() {
        @java.lang.Override
        public AnnouncementMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnnouncementMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<AnnouncementMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<AnnouncementMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface JoinMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.JoinMsg)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * Тип присоединяющегося игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
       * @return Whether the playerType field is set.
       */
      boolean hasPlayerType();
      /**
       * <pre>
       * Тип присоединяющегося игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
       * @return The playerType.
       */
      me.ippolitov.fit.snakes.SnakesProto.PlayerType getPlayerType();

      /**
       * <pre>
       * Если хотим только понаблюдать, но не играть
       * </pre>
       *
       * <code>optional bool only_view = 2 [default = false];</code>
       * @return Whether the onlyView field is set.
       */
      boolean hasOnlyView();
      /**
       * <pre>
       * Если хотим только понаблюдать, но не играть
       * </pre>
       *
       * <code>optional bool only_view = 2 [default = false];</code>
       * @return The onlyView.
       */
      boolean getOnlyView();

      /**
       * <pre>
       * Имя игрока
       * </pre>
       *
       * <code>required string name = 3;</code>
       * @return Whether the name field is set.
       */
      boolean hasName();
      /**
       * <pre>
       * Имя игрока
       * </pre>
       *
       * <code>required string name = 3;</code>
       * @return The name.
       */
      java.lang.String getName();
      /**
       * <pre>
       * Имя игрока
       * </pre>
       *
       * <code>required string name = 3;</code>
       * @return The bytes for name.
       */
      com.google.protobuf.ByteString
          getNameBytes();
    }
    /**
     * <pre>
     * Новый игрок хочет присоединиться к идущей игре
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.JoinMsg}
     */
    public static final class JoinMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.JoinMsg)
        JoinMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use JoinMsg.newBuilder() to construct.
      private JoinMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private JoinMsg() {
        playerType_ = 0;
        name_ = "";
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new JoinMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private JoinMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                int rawValue = input.readEnum();
                  @SuppressWarnings("deprecation")
                me.ippolitov.fit.snakes.SnakesProto.PlayerType value = me.ippolitov.fit.snakes.SnakesProto.PlayerType.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(1, rawValue);
                } else {
                  bitField0_ |= 0x00000001;
                  playerType_ = rawValue;
                }
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                onlyView_ = input.readBool();
                break;
              }
              case 26: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000004;
                name_ = bs;
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_JoinMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_JoinMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder.class);
      }

      private int bitField0_;
      public static final int PLAYER_TYPE_FIELD_NUMBER = 1;
      private int playerType_;
      /**
       * <pre>
       * Тип присоединяющегося игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
       * @return Whether the playerType field is set.
       */
      @java.lang.Override public boolean hasPlayerType() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Тип присоединяющегося игрока
       * </pre>
       *
       * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
       * @return The playerType.
       */
      @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.PlayerType getPlayerType() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.PlayerType result = me.ippolitov.fit.snakes.SnakesProto.PlayerType.valueOf(playerType_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.PlayerType.HUMAN : result;
      }

      public static final int ONLY_VIEW_FIELD_NUMBER = 2;
      private boolean onlyView_;
      /**
       * <pre>
       * Если хотим только понаблюдать, но не играть
       * </pre>
       *
       * <code>optional bool only_view = 2 [default = false];</code>
       * @return Whether the onlyView field is set.
       */
      @java.lang.Override
      public boolean hasOnlyView() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * Если хотим только понаблюдать, но не играть
       * </pre>
       *
       * <code>optional bool only_view = 2 [default = false];</code>
       * @return The onlyView.
       */
      @java.lang.Override
      public boolean getOnlyView() {
        return onlyView_;
      }

      public static final int NAME_FIELD_NUMBER = 3;
      private volatile java.lang.Object name_;
      /**
       * <pre>
       * Имя игрока
       * </pre>
       *
       * <code>required string name = 3;</code>
       * @return Whether the name field is set.
       */
      @java.lang.Override
      public boolean hasName() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * Имя игрока
       * </pre>
       *
       * <code>required string name = 3;</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        }
      }
      /**
       * <pre>
       * Имя игрока
       * </pre>
       *
       * <code>required string name = 3;</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasName()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeEnum(1, playerType_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeBool(2, onlyView_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(1, playerType_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeBoolSize(2, onlyView_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) obj;

        if (hasPlayerType() != other.hasPlayerType()) return false;
        if (hasPlayerType()) {
          if (playerType_ != other.playerType_) return false;
        }
        if (hasOnlyView() != other.hasOnlyView()) return false;
        if (hasOnlyView()) {
          if (getOnlyView()
              != other.getOnlyView()) return false;
        }
        if (hasName() != other.hasName()) return false;
        if (hasName()) {
          if (!getName()
              .equals(other.getName())) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasPlayerType()) {
          hash = (37 * hash) + PLAYER_TYPE_FIELD_NUMBER;
          hash = (53 * hash) + playerType_;
        }
        if (hasOnlyView()) {
          hash = (37 * hash) + ONLY_VIEW_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
              getOnlyView());
        }
        if (hasName()) {
          hash = (37 * hash) + NAME_FIELD_NUMBER;
          hash = (53 * hash) + getName().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Новый игрок хочет присоединиться к идущей игре
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.JoinMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.JoinMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_JoinMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_JoinMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          playerType_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          onlyView_ = false;
          bitField0_ = (bitField0_ & ~0x00000002);
          name_ = "";
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_JoinMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            to_bitField0_ |= 0x00000001;
          }
          result.playerType_ = playerType_;
          if (((from_bitField0_ & 0x00000002) != 0)) {
            result.onlyView_ = onlyView_;
            to_bitField0_ |= 0x00000002;
          }
          if (((from_bitField0_ & 0x00000004) != 0)) {
            to_bitField0_ |= 0x00000004;
          }
          result.name_ = name_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasPlayerType()) {
            setPlayerType(other.getPlayerType());
          }
          if (other.hasOnlyView()) {
            setOnlyView(other.getOnlyView());
          }
          if (other.hasName()) {
            bitField0_ |= 0x00000004;
            name_ = other.name_;
            onChanged();
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasName()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private int playerType_ = 0;
        /**
         * <pre>
         * Тип присоединяющегося игрока
         * </pre>
         *
         * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
         * @return Whether the playerType field is set.
         */
        @java.lang.Override public boolean hasPlayerType() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Тип присоединяющегося игрока
         * </pre>
         *
         * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
         * @return The playerType.
         */
        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.PlayerType getPlayerType() {
          @SuppressWarnings("deprecation")
          me.ippolitov.fit.snakes.SnakesProto.PlayerType result = me.ippolitov.fit.snakes.SnakesProto.PlayerType.valueOf(playerType_);
          return result == null ? me.ippolitov.fit.snakes.SnakesProto.PlayerType.HUMAN : result;
        }
        /**
         * <pre>
         * Тип присоединяющегося игрока
         * </pre>
         *
         * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
         * @param value The playerType to set.
         * @return This builder for chaining.
         */
        public Builder setPlayerType(me.ippolitov.fit.snakes.SnakesProto.PlayerType value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          playerType_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Тип присоединяющегося игрока
         * </pre>
         *
         * <code>optional .snakes.PlayerType player_type = 1 [default = HUMAN];</code>
         * @return This builder for chaining.
         */
        public Builder clearPlayerType() {
          bitField0_ = (bitField0_ & ~0x00000001);
          playerType_ = 0;
          onChanged();
          return this;
        }

        private boolean onlyView_ ;
        /**
         * <pre>
         * Если хотим только понаблюдать, но не играть
         * </pre>
         *
         * <code>optional bool only_view = 2 [default = false];</code>
         * @return Whether the onlyView field is set.
         */
        @java.lang.Override
        public boolean hasOnlyView() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <pre>
         * Если хотим только понаблюдать, но не играть
         * </pre>
         *
         * <code>optional bool only_view = 2 [default = false];</code>
         * @return The onlyView.
         */
        @java.lang.Override
        public boolean getOnlyView() {
          return onlyView_;
        }
        /**
         * <pre>
         * Если хотим только понаблюдать, но не играть
         * </pre>
         *
         * <code>optional bool only_view = 2 [default = false];</code>
         * @param value The onlyView to set.
         * @return This builder for chaining.
         */
        public Builder setOnlyView(boolean value) {
          bitField0_ |= 0x00000002;
          onlyView_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Если хотим только понаблюдать, но не играть
         * </pre>
         *
         * <code>optional bool only_view = 2 [default = false];</code>
         * @return This builder for chaining.
         */
        public Builder clearOnlyView() {
          bitField0_ = (bitField0_ & ~0x00000002);
          onlyView_ = false;
          onChanged();
          return this;
        }

        private java.lang.Object name_ = "";
        /**
         * <pre>
         * Имя игрока
         * </pre>
         *
         * <code>required string name = 3;</code>
         * @return Whether the name field is set.
         */
        public boolean hasName() {
          return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <pre>
         * Имя игрока
         * </pre>
         *
         * <code>required string name = 3;</code>
         * @return The name.
         */
        public java.lang.String getName() {
          java.lang.Object ref = name_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              name_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <pre>
         * Имя игрока
         * </pre>
         *
         * <code>required string name = 3;</code>
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString
            getNameBytes() {
          java.lang.Object ref = name_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            name_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <pre>
         * Имя игрока
         * </pre>
         *
         * <code>required string name = 3;</code>
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
          name_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Имя игрока
         * </pre>
         *
         * <code>required string name = 3;</code>
         * @return This builder for chaining.
         */
        public Builder clearName() {
          bitField0_ = (bitField0_ & ~0x00000004);
          name_ = getDefaultInstance().getName();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Имя игрока
         * </pre>
         *
         * <code>required string name = 3;</code>
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
          name_ = value;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.JoinMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.JoinMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<JoinMsg>
          PARSER = new com.google.protobuf.AbstractParser<JoinMsg>() {
        @java.lang.Override
        public JoinMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new JoinMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<JoinMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<JoinMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface ErrorMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.ErrorMsg)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <pre>
       * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
       * </pre>
       *
       * <code>required string error_message = 1;</code>
       * @return Whether the errorMessage field is set.
       */
      boolean hasErrorMessage();
      /**
       * <pre>
       * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
       * </pre>
       *
       * <code>required string error_message = 1;</code>
       * @return The errorMessage.
       */
      java.lang.String getErrorMessage();
      /**
       * <pre>
       * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
       * </pre>
       *
       * <code>required string error_message = 1;</code>
       * @return The bytes for errorMessage.
       */
      com.google.protobuf.ByteString
          getErrorMessageBytes();
    }
    /**
     * <pre>
     * Ошибка операции (например отказ в присоединении к игре, т.к. нет места на поле)
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.ErrorMsg}
     */
    public static final class ErrorMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.ErrorMsg)
        ErrorMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use ErrorMsg.newBuilder() to construct.
      private ErrorMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private ErrorMsg() {
        errorMessage_ = "";
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new ErrorMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private ErrorMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                errorMessage_ = bs;
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_ErrorMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_ErrorMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder.class);
      }

      private int bitField0_;
      public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
      private volatile java.lang.Object errorMessage_;
      /**
       * <pre>
       * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
       * </pre>
       *
       * <code>required string error_message = 1;</code>
       * @return Whether the errorMessage field is set.
       */
      @java.lang.Override
      public boolean hasErrorMessage() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
       * </pre>
       *
       * <code>required string error_message = 1;</code>
       * @return The errorMessage.
       */
      @java.lang.Override
      public java.lang.String getErrorMessage() {
        java.lang.Object ref = errorMessage_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = 
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            errorMessage_ = s;
          }
          return s;
        }
      }
      /**
       * <pre>
       * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
       * </pre>
       *
       * <code>required string error_message = 1;</code>
       * @return The bytes for errorMessage.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getErrorMessageBytes() {
        java.lang.Object ref = errorMessage_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          errorMessage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        if (!hasErrorMessage()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          com.google.protobuf.GeneratedMessageV3.writeString(output, 1, errorMessage_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, errorMessage_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) obj;

        if (hasErrorMessage() != other.hasErrorMessage()) return false;
        if (hasErrorMessage()) {
          if (!getErrorMessage()
              .equals(other.getErrorMessage())) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasErrorMessage()) {
          hash = (37 * hash) + ERROR_MESSAGE_FIELD_NUMBER;
          hash = (53 * hash) + getErrorMessage().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Ошибка операции (например отказ в присоединении к игре, т.к. нет места на поле)
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.ErrorMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.ErrorMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_ErrorMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_ErrorMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          errorMessage_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_ErrorMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            to_bitField0_ |= 0x00000001;
          }
          result.errorMessage_ = errorMessage_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasErrorMessage()) {
            bitField0_ |= 0x00000001;
            errorMessage_ = other.errorMessage_;
            onChanged();
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          if (!hasErrorMessage()) {
            return false;
          }
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private java.lang.Object errorMessage_ = "";
        /**
         * <pre>
         * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
         * </pre>
         *
         * <code>required string error_message = 1;</code>
         * @return Whether the errorMessage field is set.
         */
        public boolean hasErrorMessage() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
         * </pre>
         *
         * <code>required string error_message = 1;</code>
         * @return The errorMessage.
         */
        public java.lang.String getErrorMessage() {
          java.lang.Object ref = errorMessage_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              errorMessage_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }
        /**
         * <pre>
         * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
         * </pre>
         *
         * <code>required string error_message = 1;</code>
         * @return The bytes for errorMessage.
         */
        public com.google.protobuf.ByteString
            getErrorMessageBytes() {
          java.lang.Object ref = errorMessage_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b = 
                com.google.protobuf.ByteString.copyFromUtf8(
                    (java.lang.String) ref);
            errorMessage_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }
        /**
         * <pre>
         * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
         * </pre>
         *
         * <code>required string error_message = 1;</code>
         * @param value The errorMessage to set.
         * @return This builder for chaining.
         */
        public Builder setErrorMessage(
            java.lang.String value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          errorMessage_ = value;
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
         * </pre>
         *
         * <code>required string error_message = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearErrorMessage() {
          bitField0_ = (bitField0_ & ~0x00000001);
          errorMessage_ = getDefaultInstance().getErrorMessage();
          onChanged();
          return this;
        }
        /**
         * <pre>
         * Строковое сообщение, нужно отобразить его на экране, не блокируя работу программы
         * </pre>
         *
         * <code>required string error_message = 1;</code>
         * @param value The bytes for errorMessage to set.
         * @return This builder for chaining.
         */
        public Builder setErrorMessageBytes(
            com.google.protobuf.ByteString value) {
          if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
          errorMessage_ = value;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.ErrorMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.ErrorMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<ErrorMsg>
          PARSER = new com.google.protobuf.AbstractParser<ErrorMsg>() {
        @java.lang.Override
        public ErrorMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ErrorMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<ErrorMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<ErrorMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    public interface RoleChangeMsgOrBuilder extends
        // @@protoc_insertion_point(interface_extends:snakes.GameMessage.RoleChangeMsg)
        com.google.protobuf.MessageOrBuilder {

      /**
       * <code>optional .snakes.NodeRole sender_role = 1;</code>
       * @return Whether the senderRole field is set.
       */
      boolean hasSenderRole();
      /**
       * <code>optional .snakes.NodeRole sender_role = 1;</code>
       * @return The senderRole.
       */
      me.ippolitov.fit.snakes.SnakesProto.NodeRole getSenderRole();

      /**
       * <code>optional .snakes.NodeRole receiver_role = 2;</code>
       * @return Whether the receiverRole field is set.
       */
      boolean hasReceiverRole();
      /**
       * <code>optional .snakes.NodeRole receiver_role = 2;</code>
       * @return The receiverRole.
       */
      me.ippolitov.fit.snakes.SnakesProto.NodeRole getReceiverRole();
    }
    /**
     * <pre>
     * Сообщение о смене роли:
     * 1. от заместителя другим игрокам о том, что пора начинать считать его главным (sender_role = MASTER)
     * 2. от осознанно выходящего игрока (sender_role = VIEWER)
     * 3. от главного к умершему игроку (receiver_role = VIEWER)
     * 4. в комбинации с 1,2 или отдельно от них: назначение кого-то заместителем (receiver_role = DEPUTY)
     * 5. в комбинации с 2 от главного узла заместителю о том, что он становится главным (receiver_role = MASTER)
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage.RoleChangeMsg}
     */
    public static final class RoleChangeMsg extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:snakes.GameMessage.RoleChangeMsg)
        RoleChangeMsgOrBuilder {
    private static final long serialVersionUID = 0L;
      // Use RoleChangeMsg.newBuilder() to construct.
      private RoleChangeMsg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
      }
      private RoleChangeMsg() {
        senderRole_ = 0;
        receiverRole_ = 0;
      }

      @java.lang.Override
      @SuppressWarnings({"unused"})
      protected java.lang.Object newInstance(
          UnusedPrivateParameter unused) {
        return new RoleChangeMsg();
      }

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet
      getUnknownFields() {
        return this.unknownFields;
      }
      private RoleChangeMsg(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
            com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                int rawValue = input.readEnum();
                  @SuppressWarnings("deprecation")
                me.ippolitov.fit.snakes.SnakesProto.NodeRole value = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(1, rawValue);
                } else {
                  bitField0_ |= 0x00000001;
                  senderRole_ = rawValue;
                }
                break;
              }
              case 16: {
                int rawValue = input.readEnum();
                  @SuppressWarnings("deprecation")
                me.ippolitov.fit.snakes.SnakesProto.NodeRole value = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(2, rawValue);
                } else {
                  bitField0_ |= 0x00000002;
                  receiverRole_ = rawValue;
                }
                break;
              }
              default: {
                if (!parseUnknownField(
                    input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(
              e).setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_RoleChangeMsg_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_RoleChangeMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder.class);
      }

      private int bitField0_;
      public static final int SENDER_ROLE_FIELD_NUMBER = 1;
      private int senderRole_;
      /**
       * <code>optional .snakes.NodeRole sender_role = 1;</code>
       * @return Whether the senderRole field is set.
       */
      @java.lang.Override public boolean hasSenderRole() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional .snakes.NodeRole sender_role = 1;</code>
       * @return The senderRole.
       */
      @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.NodeRole getSenderRole() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.NodeRole result = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(senderRole_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.NodeRole.NORMAL : result;
      }

      public static final int RECEIVER_ROLE_FIELD_NUMBER = 2;
      private int receiverRole_;
      /**
       * <code>optional .snakes.NodeRole receiver_role = 2;</code>
       * @return Whether the receiverRole field is set.
       */
      @java.lang.Override public boolean hasReceiverRole() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .snakes.NodeRole receiver_role = 2;</code>
       * @return The receiverRole.
       */
      @java.lang.Override public me.ippolitov.fit.snakes.SnakesProto.NodeRole getReceiverRole() {
        @SuppressWarnings("deprecation")
        me.ippolitov.fit.snakes.SnakesProto.NodeRole result = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(receiverRole_);
        return result == null ? me.ippolitov.fit.snakes.SnakesProto.NodeRole.NORMAL : result;
      }

      private byte memoizedIsInitialized = -1;
      @java.lang.Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
      }

      @java.lang.Override
      public void writeTo(com.google.protobuf.CodedOutputStream output)
                          throws java.io.IOException {
        if (((bitField0_ & 0x00000001) != 0)) {
          output.writeEnum(1, senderRole_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          output.writeEnum(2, receiverRole_);
        }
        unknownFields.writeTo(output);
      }

      @java.lang.Override
      public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(1, senderRole_);
        }
        if (((bitField0_ & 0x00000002) != 0)) {
          size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(2, receiverRole_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
      }

      @java.lang.Override
      public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
         return true;
        }
        if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg)) {
          return super.equals(obj);
        }
        me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) obj;

        if (hasSenderRole() != other.hasSenderRole()) return false;
        if (hasSenderRole()) {
          if (senderRole_ != other.senderRole_) return false;
        }
        if (hasReceiverRole() != other.hasReceiverRole()) return false;
        if (hasReceiverRole()) {
          if (receiverRole_ != other.receiverRole_) return false;
        }
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
      }

      @java.lang.Override
      public int hashCode() {
        if (memoizedHashCode != 0) {
          return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (hasSenderRole()) {
          hash = (37 * hash) + SENDER_ROLE_FIELD_NUMBER;
          hash = (53 * hash) + senderRole_;
        }
        if (hasReceiverRole()) {
          hash = (37 * hash) + RECEIVER_ROLE_FIELD_NUMBER;
          hash = (53 * hash) + receiverRole_;
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          java.nio.ByteBuffer data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(byte[] data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          byte[] data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseDelimitedFrom(java.io.InputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseDelimitedFrom(
          java.io.InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          com.google.protobuf.CodedInputStream input)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
      }
      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
      }

      @java.lang.Override
      public Builder newBuilderForType() { return newBuilder(); }
      public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
      }
      public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
      }
      @java.lang.Override
      public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }
      /**
       * <pre>
       * Сообщение о смене роли:
       * 1. от заместителя другим игрокам о том, что пора начинать считать его главным (sender_role = MASTER)
       * 2. от осознанно выходящего игрока (sender_role = VIEWER)
       * 3. от главного к умершему игроку (receiver_role = VIEWER)
       * 4. в комбинации с 1,2 или отдельно от них: назначение кого-то заместителем (receiver_role = DEPUTY)
       * 5. в комбинации с 2 от главного узла заместителю о том, что он становится главным (receiver_role = MASTER)
       * </pre>
       *
       * Protobuf type {@code snakes.GameMessage.RoleChangeMsg}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
          // @@protoc_insertion_point(builder_implements:snakes.GameMessage.RoleChangeMsg)
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsgOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
          return internal_static_snakes_GameMessage_RoleChangeMsg_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
          return internal_static_snakes_GameMessage_RoleChangeMsg_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder.class);
        }

        // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }
        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessageV3
                  .alwaysUseFieldBuilders) {
          }
        }
        @java.lang.Override
        public Builder clear() {
          super.clear();
          senderRole_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          receiverRole_ = 0;
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
          return internal_static_snakes_GameMessage_RoleChangeMsg_descriptor;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg getDefaultInstanceForType() {
          return getDefaultInstance();
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg build() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg buildPartial() {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) != 0)) {
            to_bitField0_ |= 0x00000001;
          }
          result.senderRole_ = senderRole_;
          if (((from_bitField0_ & 0x00000002) != 0)) {
            to_bitField0_ |= 0x00000002;
          }
          result.receiverRole_ = receiverRole_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @java.lang.Override
        public Builder clone() {
          return super.clone();
        }
        @java.lang.Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.setField(field, value);
        }
        @java.lang.Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
          return super.clearField(field);
        }
        @java.lang.Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
          return super.clearOneof(oneof);
        }
        @java.lang.Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, java.lang.Object value) {
          return super.setRepeatedField(field, index, value);
        }
        @java.lang.Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            java.lang.Object value) {
          return super.addRepeatedField(field, value);
        }
        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) {
            return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg)other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg other) {
          if (other == getDefaultInstance()) return this;
          if (other.hasSenderRole()) {
            setSenderRole(other.getSenderRole());
          }
          if (other.hasReceiverRole()) {
            setReceiverRole(other.getReceiverRole());
          }
          this.mergeUnknownFields(other.unknownFields);
          onChanged();
          return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
          return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) e.getUnfinishedMessage();
            throw e.unwrapIOException();
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }
        private int bitField0_;

        private int senderRole_ = 0;
        /**
         * <code>optional .snakes.NodeRole sender_role = 1;</code>
         * @return Whether the senderRole field is set.
         */
        @java.lang.Override public boolean hasSenderRole() {
          return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>optional .snakes.NodeRole sender_role = 1;</code>
         * @return The senderRole.
         */
        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.NodeRole getSenderRole() {
          @SuppressWarnings("deprecation")
          me.ippolitov.fit.snakes.SnakesProto.NodeRole result = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(senderRole_);
          return result == null ? me.ippolitov.fit.snakes.SnakesProto.NodeRole.NORMAL : result;
        }
        /**
         * <code>optional .snakes.NodeRole sender_role = 1;</code>
         * @param value The senderRole to set.
         * @return This builder for chaining.
         */
        public Builder setSenderRole(me.ippolitov.fit.snakes.SnakesProto.NodeRole value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          senderRole_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <code>optional .snakes.NodeRole sender_role = 1;</code>
         * @return This builder for chaining.
         */
        public Builder clearSenderRole() {
          bitField0_ = (bitField0_ & ~0x00000001);
          senderRole_ = 0;
          onChanged();
          return this;
        }

        private int receiverRole_ = 0;
        /**
         * <code>optional .snakes.NodeRole receiver_role = 2;</code>
         * @return Whether the receiverRole field is set.
         */
        @java.lang.Override public boolean hasReceiverRole() {
          return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>optional .snakes.NodeRole receiver_role = 2;</code>
         * @return The receiverRole.
         */
        @java.lang.Override
        public me.ippolitov.fit.snakes.SnakesProto.NodeRole getReceiverRole() {
          @SuppressWarnings("deprecation")
          me.ippolitov.fit.snakes.SnakesProto.NodeRole result = me.ippolitov.fit.snakes.SnakesProto.NodeRole.valueOf(receiverRole_);
          return result == null ? me.ippolitov.fit.snakes.SnakesProto.NodeRole.NORMAL : result;
        }
        /**
         * <code>optional .snakes.NodeRole receiver_role = 2;</code>
         * @param value The receiverRole to set.
         * @return This builder for chaining.
         */
        public Builder setReceiverRole(me.ippolitov.fit.snakes.SnakesProto.NodeRole value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          receiverRole_ = value.getNumber();
          onChanged();
          return this;
        }
        /**
         * <code>optional .snakes.NodeRole receiver_role = 2;</code>
         * @return This builder for chaining.
         */
        public Builder clearReceiverRole() {
          bitField0_ = (bitField0_ & ~0x00000002);
          receiverRole_ = 0;
          onChanged();
          return this;
        }
        @java.lang.Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
          return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:snakes.GameMessage.RoleChangeMsg)
      }

      // @@protoc_insertion_point(class_scope:snakes.GameMessage.RoleChangeMsg)
      private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg DEFAULT_INSTANCE;
      static {
        DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg();
      }

      public static me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
      }

      @java.lang.Deprecated public static final com.google.protobuf.Parser<RoleChangeMsg>
          PARSER = new com.google.protobuf.AbstractParser<RoleChangeMsg>() {
        @java.lang.Override
        public RoleChangeMsg parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RoleChangeMsg(input, extensionRegistry);
        }
      };

      public static com.google.protobuf.Parser<RoleChangeMsg> parser() {
        return PARSER;
      }

      @java.lang.Override
      public com.google.protobuf.Parser<RoleChangeMsg> getParserForType() {
        return PARSER;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
      }

    }

    private int bitField0_;
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public enum TypeCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      PING(2),
      STEER(3),
      ACK(4),
      STATE(5),
      ANNOUNCEMENT(6),
      JOIN(7),
      ERROR(8),
      ROLE_CHANGE(9),
      TYPE_NOT_SET(0);
      private final int value;
      private TypeCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static TypeCase valueOf(int value) {
        return forNumber(value);
      }

      public static TypeCase forNumber(int value) {
        switch (value) {
          case 2: return PING;
          case 3: return STEER;
          case 4: return ACK;
          case 5: return STATE;
          case 6: return ANNOUNCEMENT;
          case 7: return JOIN;
          case 8: return ERROR;
          case 9: return ROLE_CHANGE;
          case 0: return TYPE_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public TypeCase
    getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public static final int MSG_SEQ_FIELD_NUMBER = 1;
    private long msgSeq_;
    /**
     * <pre>
     * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int64 msg_seq = 1;</code>
     * @return Whether the msgSeq field is set.
     */
    @java.lang.Override
    public boolean hasMsgSeq() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
     * </pre>
     *
     * <code>required int64 msg_seq = 1;</code>
     * @return The msgSeq.
     */
    @java.lang.Override
    public long getMsgSeq() {
      return msgSeq_;
    }

    public static final int SENDER_ID_FIELD_NUMBER = 10;
    private int senderId_;
    /**
     * <pre>
     * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 sender_id = 10;</code>
     * @return Whether the senderId field is set.
     */
    @java.lang.Override
    public boolean hasSenderId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 sender_id = 10;</code>
     * @return The senderId.
     */
    @java.lang.Override
    public int getSenderId() {
      return senderId_;
    }

    public static final int RECEIVER_ID_FIELD_NUMBER = 11;
    private int receiverId_;
    /**
     * <pre>
     * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 receiver_id = 11;</code>
     * @return Whether the receiverId field is set.
     */
    @java.lang.Override
    public boolean hasReceiverId() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
     * </pre>
     *
     * <code>optional int32 receiver_id = 11;</code>
     * @return The receiverId.
     */
    @java.lang.Override
    public int getReceiverId() {
      return receiverId_;
    }

    public static final int PING_FIELD_NUMBER = 2;
    /**
     * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
     * @return Whether the ping field is set.
     */
    @java.lang.Override
    public boolean hasPing() {
      return typeCase_ == 2;
    }
    /**
     * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
     * @return The ping.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg getPing() {
      if (typeCase_ == 2) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsgOrBuilder getPingOrBuilder() {
      if (typeCase_ == 2) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.getDefaultInstance();
    }

    public static final int STEER_FIELD_NUMBER = 3;
    /**
     * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
     * @return Whether the steer field is set.
     */
    @java.lang.Override
    public boolean hasSteer() {
      return typeCase_ == 3;
    }
    /**
     * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
     * @return The steer.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg getSteer() {
      if (typeCase_ == 3) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsgOrBuilder getSteerOrBuilder() {
      if (typeCase_ == 3) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.getDefaultInstance();
    }

    public static final int ACK_FIELD_NUMBER = 4;
    /**
     * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
     * @return Whether the ack field is set.
     */
    @java.lang.Override
    public boolean hasAck() {
      return typeCase_ == 4;
    }
    /**
     * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
     * @return The ack.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg getAck() {
      if (typeCase_ == 4) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsgOrBuilder getAckOrBuilder() {
      if (typeCase_ == 4) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.getDefaultInstance();
    }

    public static final int STATE_FIELD_NUMBER = 5;
    /**
     * <code>.snakes.GameMessage.StateMsg state = 5;</code>
     * @return Whether the state field is set.
     */
    @java.lang.Override
    public boolean hasState() {
      return typeCase_ == 5;
    }
    /**
     * <code>.snakes.GameMessage.StateMsg state = 5;</code>
     * @return The state.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg getState() {
      if (typeCase_ == 5) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.StateMsg state = 5;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsgOrBuilder getStateOrBuilder() {
      if (typeCase_ == 5) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.getDefaultInstance();
    }

    public static final int ANNOUNCEMENT_FIELD_NUMBER = 6;
    /**
     * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
     * @return Whether the announcement field is set.
     */
    @java.lang.Override
    public boolean hasAnnouncement() {
      return typeCase_ == 6;
    }
    /**
     * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
     * @return The announcement.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg getAnnouncement() {
      if (typeCase_ == 6) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsgOrBuilder getAnnouncementOrBuilder() {
      if (typeCase_ == 6) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.getDefaultInstance();
    }

    public static final int JOIN_FIELD_NUMBER = 7;
    /**
     * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
     * @return Whether the join field is set.
     */
    @java.lang.Override
    public boolean hasJoin() {
      return typeCase_ == 7;
    }
    /**
     * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
     * @return The join.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg getJoin() {
      if (typeCase_ == 7) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsgOrBuilder getJoinOrBuilder() {
      if (typeCase_ == 7) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.getDefaultInstance();
    }

    public static final int ERROR_FIELD_NUMBER = 8;
    /**
     * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
     * @return Whether the error field is set.
     */
    @java.lang.Override
    public boolean hasError() {
      return typeCase_ == 8;
    }
    /**
     * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
     * @return The error.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg getError() {
      if (typeCase_ == 8) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsgOrBuilder getErrorOrBuilder() {
      if (typeCase_ == 8) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.getDefaultInstance();
    }

    public static final int ROLE_CHANGE_FIELD_NUMBER = 9;
    /**
     * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
     * @return Whether the roleChange field is set.
     */
    @java.lang.Override
    public boolean hasRoleChange() {
      return typeCase_ == 9;
    }
    /**
     * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
     * @return The roleChange.
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg getRoleChange() {
      if (typeCase_ == 9) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.getDefaultInstance();
    }
    /**
     * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
     */
    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsgOrBuilder getRoleChangeOrBuilder() {
      if (typeCase_ == 9) {
         return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_;
      }
      return me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.getDefaultInstance();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMsgSeq()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasSteer()) {
        if (!getSteer().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasState()) {
        if (!getState().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasAnnouncement()) {
        if (!getAnnouncement().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasJoin()) {
        if (!getJoin().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasError()) {
        if (!getError().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt64(1, msgSeq_);
      }
      if (typeCase_ == 2) {
        output.writeMessage(2, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_);
      }
      if (typeCase_ == 3) {
        output.writeMessage(3, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_);
      }
      if (typeCase_ == 4) {
        output.writeMessage(4, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_);
      }
      if (typeCase_ == 5) {
        output.writeMessage(5, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_);
      }
      if (typeCase_ == 6) {
        output.writeMessage(6, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_);
      }
      if (typeCase_ == 7) {
        output.writeMessage(7, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_);
      }
      if (typeCase_ == 8) {
        output.writeMessage(8, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_);
      }
      if (typeCase_ == 9) {
        output.writeMessage(9, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(10, senderId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeInt32(11, receiverId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, msgSeq_);
      }
      if (typeCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_);
      }
      if (typeCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_);
      }
      if (typeCase_ == 4) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_);
      }
      if (typeCase_ == 5) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_);
      }
      if (typeCase_ == 6) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_);
      }
      if (typeCase_ == 7) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_);
      }
      if (typeCase_ == 8) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_);
      }
      if (typeCase_ == 9) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(10, senderId_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, receiverId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage)) {
        return super.equals(obj);
      }
      me.ippolitov.fit.snakes.SnakesProto.GameMessage other = (me.ippolitov.fit.snakes.SnakesProto.GameMessage) obj;

      if (hasMsgSeq() != other.hasMsgSeq()) return false;
      if (hasMsgSeq()) {
        if (getMsgSeq()
            != other.getMsgSeq()) return false;
      }
      if (hasSenderId() != other.hasSenderId()) return false;
      if (hasSenderId()) {
        if (getSenderId()
            != other.getSenderId()) return false;
      }
      if (hasReceiverId() != other.hasReceiverId()) return false;
      if (hasReceiverId()) {
        if (getReceiverId()
            != other.getReceiverId()) return false;
      }
      if (!getTypeCase().equals(other.getTypeCase())) return false;
      switch (typeCase_) {
        case 2:
          if (!getPing()
              .equals(other.getPing())) return false;
          break;
        case 3:
          if (!getSteer()
              .equals(other.getSteer())) return false;
          break;
        case 4:
          if (!getAck()
              .equals(other.getAck())) return false;
          break;
        case 5:
          if (!getState()
              .equals(other.getState())) return false;
          break;
        case 6:
          if (!getAnnouncement()
              .equals(other.getAnnouncement())) return false;
          break;
        case 7:
          if (!getJoin()
              .equals(other.getJoin())) return false;
          break;
        case 8:
          if (!getError()
              .equals(other.getError())) return false;
          break;
        case 9:
          if (!getRoleChange()
              .equals(other.getRoleChange())) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasMsgSeq()) {
        hash = (37 * hash) + MSG_SEQ_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getMsgSeq());
      }
      if (hasSenderId()) {
        hash = (37 * hash) + SENDER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getSenderId();
      }
      if (hasReceiverId()) {
        hash = (37 * hash) + RECEIVER_ID_FIELD_NUMBER;
        hash = (53 * hash) + getReceiverId();
      }
      switch (typeCase_) {
        case 2:
          hash = (37 * hash) + PING_FIELD_NUMBER;
          hash = (53 * hash) + getPing().hashCode();
          break;
        case 3:
          hash = (37 * hash) + STEER_FIELD_NUMBER;
          hash = (53 * hash) + getSteer().hashCode();
          break;
        case 4:
          hash = (37 * hash) + ACK_FIELD_NUMBER;
          hash = (53 * hash) + getAck().hashCode();
          break;
        case 5:
          hash = (37 * hash) + STATE_FIELD_NUMBER;
          hash = (53 * hash) + getState().hashCode();
          break;
        case 6:
          hash = (37 * hash) + ANNOUNCEMENT_FIELD_NUMBER;
          hash = (53 * hash) + getAnnouncement().hashCode();
          break;
        case 7:
          hash = (37 * hash) + JOIN_FIELD_NUMBER;
          hash = (53 * hash) + getJoin().hashCode();
          break;
        case 8:
          hash = (37 * hash) + ERROR_FIELD_NUMBER;
          hash = (53 * hash) + getError().hashCode();
          break;
        case 9:
          hash = (37 * hash) + ROLE_CHANGE_FIELD_NUMBER;
          hash = (53 * hash) + getRoleChange().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(me.ippolitov.fit.snakes.SnakesProto.GameMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Общий формат любого сообщения
     * </pre>
     *
     * Protobuf type {@code snakes.GameMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:snakes.GameMessage)
        me.ippolitov.fit.snakes.SnakesProto.GameMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return internal_static_snakes_GameMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return internal_static_snakes_GameMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                me.ippolitov.fit.snakes.SnakesProto.GameMessage.class, me.ippolitov.fit.snakes.SnakesProto.GameMessage.Builder.class);
      }

      // Construct using me.ippolitov.fit.snakes.SnakesProto.GameMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        msgSeq_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        senderId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        receiverId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        typeCase_ = 0;
        type_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return internal_static_snakes_GameMessage_descriptor;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage getDefaultInstanceForType() {
        return getDefaultInstance();
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage build() {
        me.ippolitov.fit.snakes.SnakesProto.GameMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage buildPartial() {
        me.ippolitov.fit.snakes.SnakesProto.GameMessage result = new me.ippolitov.fit.snakes.SnakesProto.GameMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.msgSeq_ = msgSeq_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.senderId_ = senderId_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.receiverId_ = receiverId_;
          to_bitField0_ |= 0x00000004;
        }
        if (typeCase_ == 2) {
          if (pingBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = pingBuilder_.build();
          }
        }
        if (typeCase_ == 3) {
          if (steerBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = steerBuilder_.build();
          }
        }
        if (typeCase_ == 4) {
          if (ackBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = ackBuilder_.build();
          }
        }
        if (typeCase_ == 5) {
          if (stateBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = stateBuilder_.build();
          }
        }
        if (typeCase_ == 6) {
          if (announcementBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = announcementBuilder_.build();
          }
        }
        if (typeCase_ == 7) {
          if (joinBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = joinBuilder_.build();
          }
        }
        if (typeCase_ == 8) {
          if (errorBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = errorBuilder_.build();
          }
        }
        if (typeCase_ == 9) {
          if (roleChangeBuilder_ == null) {
            result.type_ = type_;
          } else {
            result.type_ = roleChangeBuilder_.build();
          }
        }
        result.bitField0_ = to_bitField0_;
        result.typeCase_ = typeCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof me.ippolitov.fit.snakes.SnakesProto.GameMessage) {
          return mergeFrom((me.ippolitov.fit.snakes.SnakesProto.GameMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(me.ippolitov.fit.snakes.SnakesProto.GameMessage other) {
        if (other == getDefaultInstance()) return this;
        if (other.hasMsgSeq()) {
          setMsgSeq(other.getMsgSeq());
        }
        if (other.hasSenderId()) {
          setSenderId(other.getSenderId());
        }
        if (other.hasReceiverId()) {
          setReceiverId(other.getReceiverId());
        }
        switch (other.getTypeCase()) {
          case PING: {
            mergePing(other.getPing());
            break;
          }
          case STEER: {
            mergeSteer(other.getSteer());
            break;
          }
          case ACK: {
            mergeAck(other.getAck());
            break;
          }
          case STATE: {
            mergeState(other.getState());
            break;
          }
          case ANNOUNCEMENT: {
            mergeAnnouncement(other.getAnnouncement());
            break;
          }
          case JOIN: {
            mergeJoin(other.getJoin());
            break;
          }
          case ERROR: {
            mergeError(other.getError());
            break;
          }
          case ROLE_CHANGE: {
            mergeRoleChange(other.getRoleChange());
            break;
          }
          case TYPE_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasMsgSeq()) {
          return false;
        }
        if (hasSteer()) {
          if (!getSteer().isInitialized()) {
            return false;
          }
        }
        if (hasState()) {
          if (!getState().isInitialized()) {
            return false;
          }
        }
        if (hasAnnouncement()) {
          if (!getAnnouncement().isInitialized()) {
            return false;
          }
        }
        if (hasJoin()) {
          if (!getJoin().isInitialized()) {
            return false;
          }
        }
        if (hasError()) {
          if (!getError().isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        me.ippolitov.fit.snakes.SnakesProto.GameMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (me.ippolitov.fit.snakes.SnakesProto.GameMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int typeCase_ = 0;
      private java.lang.Object type_;
      public TypeCase
          getTypeCase() {
        return TypeCase.forNumber(
            typeCase_);
      }

      public Builder clearType() {
        typeCase_ = 0;
        type_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private long msgSeq_ ;
      /**
       * <pre>
       * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int64 msg_seq = 1;</code>
       * @return Whether the msgSeq field is set.
       */
      @java.lang.Override
      public boolean hasMsgSeq() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int64 msg_seq = 1;</code>
       * @return The msgSeq.
       */
      @java.lang.Override
      public long getMsgSeq() {
        return msgSeq_;
      }
      /**
       * <pre>
       * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int64 msg_seq = 1;</code>
       * @param value The msgSeq to set.
       * @return This builder for chaining.
       */
      public Builder setMsgSeq(long value) {
        bitField0_ |= 0x00000001;
        msgSeq_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Порядковый номер сообщения, уникален для отправителя в пределах игры, монотонно возрастает
       * </pre>
       *
       * <code>required int64 msg_seq = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsgSeq() {
        bitField0_ = (bitField0_ & ~0x00000001);
        msgSeq_ = 0L;
        onChanged();
        return this;
      }

      private int senderId_ ;
      /**
       * <pre>
       * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 sender_id = 10;</code>
       * @return Whether the senderId field is set.
       */
      @java.lang.Override
      public boolean hasSenderId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 sender_id = 10;</code>
       * @return The senderId.
       */
      @java.lang.Override
      public int getSenderId() {
        return senderId_;
      }
      /**
       * <pre>
       * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 sender_id = 10;</code>
       * @param value The senderId to set.
       * @return This builder for chaining.
       */
      public Builder setSenderId(int value) {
        bitField0_ |= 0x00000002;
        senderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID игрока-отправителя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 sender_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearSenderId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        senderId_ = 0;
        onChanged();
        return this;
      }

      private int receiverId_ ;
      /**
       * <pre>
       * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 receiver_id = 11;</code>
       * @return Whether the receiverId field is set.
       */
      @java.lang.Override
      public boolean hasReceiverId() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 receiver_id = 11;</code>
       * @return The receiverId.
       */
      @java.lang.Override
      public int getReceiverId() {
        return receiverId_;
      }
      /**
       * <pre>
       * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 receiver_id = 11;</code>
       * @param value The receiverId to set.
       * @return This builder for chaining.
       */
      public Builder setReceiverId(int value) {
        bitField0_ |= 0x00000004;
        receiverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ID игрока-получателя этого сообщения (обязательно для AckMsg и RoleChangeMsg)
       * </pre>
       *
       * <code>optional int32 receiver_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearReceiverId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        receiverId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsgOrBuilder> pingBuilder_;
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       * @return Whether the ping field is set.
       */
      @java.lang.Override
      public boolean hasPing() {
        return typeCase_ == 2;
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       * @return The ping.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg getPing() {
        if (pingBuilder_ == null) {
          if (typeCase_ == 2) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 2) {
            return pingBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       */
      public Builder setPing(me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg value) {
        if (pingBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          pingBuilder_.setMessage(value);
        }
        typeCase_ = 2;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       */
      public Builder setPing(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder builderForValue) {
        if (pingBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          pingBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 2;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       */
      public Builder mergePing(me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg value) {
        if (pingBuilder_ == null) {
          if (typeCase_ == 2 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 2) {
            pingBuilder_.mergeFrom(value);
          }
          pingBuilder_.setMessage(value);
        }
        typeCase_ = 2;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       */
      public Builder clearPing() {
        if (pingBuilder_ == null) {
          if (typeCase_ == 2) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 2) {
            typeCase_ = 0;
            type_ = null;
          }
          pingBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder getPingBuilder() {
        return getPingFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsgOrBuilder getPingOrBuilder() {
        if ((typeCase_ == 2) && (pingBuilder_ != null)) {
          return pingBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 2) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.PingMsg ping = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsgOrBuilder> 
          getPingFieldBuilder() {
        if (pingBuilder_ == null) {
          if (!(typeCase_ == 2)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.getDefaultInstance();
          }
          pingBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.PingMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 2;
        onChanged();;
        return pingBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsgOrBuilder> steerBuilder_;
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       * @return Whether the steer field is set.
       */
      @java.lang.Override
      public boolean hasSteer() {
        return typeCase_ == 3;
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       * @return The steer.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg getSteer() {
        if (steerBuilder_ == null) {
          if (typeCase_ == 3) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 3) {
            return steerBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       */
      public Builder setSteer(me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg value) {
        if (steerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          steerBuilder_.setMessage(value);
        }
        typeCase_ = 3;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       */
      public Builder setSteer(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder builderForValue) {
        if (steerBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          steerBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 3;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       */
      public Builder mergeSteer(me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg value) {
        if (steerBuilder_ == null) {
          if (typeCase_ == 3 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 3) {
            steerBuilder_.mergeFrom(value);
          }
          steerBuilder_.setMessage(value);
        }
        typeCase_ = 3;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       */
      public Builder clearSteer() {
        if (steerBuilder_ == null) {
          if (typeCase_ == 3) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 3) {
            typeCase_ = 0;
            type_ = null;
          }
          steerBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder getSteerBuilder() {
        return getSteerFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsgOrBuilder getSteerOrBuilder() {
        if ((typeCase_ == 3) && (steerBuilder_ != null)) {
          return steerBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 3) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.SteerMsg steer = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsgOrBuilder> 
          getSteerFieldBuilder() {
        if (steerBuilder_ == null) {
          if (!(typeCase_ == 3)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.getDefaultInstance();
          }
          steerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.SteerMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 3;
        onChanged();;
        return steerBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsgOrBuilder> ackBuilder_;
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       * @return Whether the ack field is set.
       */
      @java.lang.Override
      public boolean hasAck() {
        return typeCase_ == 4;
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       * @return The ack.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg getAck() {
        if (ackBuilder_ == null) {
          if (typeCase_ == 4) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 4) {
            return ackBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       */
      public Builder setAck(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg value) {
        if (ackBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          ackBuilder_.setMessage(value);
        }
        typeCase_ = 4;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       */
      public Builder setAck(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder builderForValue) {
        if (ackBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          ackBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 4;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       */
      public Builder mergeAck(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg value) {
        if (ackBuilder_ == null) {
          if (typeCase_ == 4 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 4) {
            ackBuilder_.mergeFrom(value);
          }
          ackBuilder_.setMessage(value);
        }
        typeCase_ = 4;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       */
      public Builder clearAck() {
        if (ackBuilder_ == null) {
          if (typeCase_ == 4) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 4) {
            typeCase_ = 0;
            type_ = null;
          }
          ackBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder getAckBuilder() {
        return getAckFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsgOrBuilder getAckOrBuilder() {
        if ((typeCase_ == 4) && (ackBuilder_ != null)) {
          return ackBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 4) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.AckMsg ack = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsgOrBuilder> 
          getAckFieldBuilder() {
        if (ackBuilder_ == null) {
          if (!(typeCase_ == 4)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.getDefaultInstance();
          }
          ackBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AckMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 4;
        onChanged();;
        return ackBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsgOrBuilder> stateBuilder_;
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       * @return Whether the state field is set.
       */
      @java.lang.Override
      public boolean hasState() {
        return typeCase_ == 5;
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       * @return The state.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg getState() {
        if (stateBuilder_ == null) {
          if (typeCase_ == 5) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 5) {
            return stateBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       */
      public Builder setState(me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg value) {
        if (stateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          stateBuilder_.setMessage(value);
        }
        typeCase_ = 5;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       */
      public Builder setState(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder builderForValue) {
        if (stateBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          stateBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 5;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       */
      public Builder mergeState(me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg value) {
        if (stateBuilder_ == null) {
          if (typeCase_ == 5 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 5) {
            stateBuilder_.mergeFrom(value);
          }
          stateBuilder_.setMessage(value);
        }
        typeCase_ = 5;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       */
      public Builder clearState() {
        if (stateBuilder_ == null) {
          if (typeCase_ == 5) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 5) {
            typeCase_ = 0;
            type_ = null;
          }
          stateBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder getStateBuilder() {
        return getStateFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsgOrBuilder getStateOrBuilder() {
        if ((typeCase_ == 5) && (stateBuilder_ != null)) {
          return stateBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 5) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.StateMsg state = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsgOrBuilder> 
          getStateFieldBuilder() {
        if (stateBuilder_ == null) {
          if (!(typeCase_ == 5)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.getDefaultInstance();
          }
          stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.StateMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 5;
        onChanged();;
        return stateBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsgOrBuilder> announcementBuilder_;
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       * @return Whether the announcement field is set.
       */
      @java.lang.Override
      public boolean hasAnnouncement() {
        return typeCase_ == 6;
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       * @return The announcement.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg getAnnouncement() {
        if (announcementBuilder_ == null) {
          if (typeCase_ == 6) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 6) {
            return announcementBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       */
      public Builder setAnnouncement(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg value) {
        if (announcementBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          announcementBuilder_.setMessage(value);
        }
        typeCase_ = 6;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       */
      public Builder setAnnouncement(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder builderForValue) {
        if (announcementBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          announcementBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 6;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       */
      public Builder mergeAnnouncement(me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg value) {
        if (announcementBuilder_ == null) {
          if (typeCase_ == 6 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 6) {
            announcementBuilder_.mergeFrom(value);
          }
          announcementBuilder_.setMessage(value);
        }
        typeCase_ = 6;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       */
      public Builder clearAnnouncement() {
        if (announcementBuilder_ == null) {
          if (typeCase_ == 6) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 6) {
            typeCase_ = 0;
            type_ = null;
          }
          announcementBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder getAnnouncementBuilder() {
        return getAnnouncementFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsgOrBuilder getAnnouncementOrBuilder() {
        if ((typeCase_ == 6) && (announcementBuilder_ != null)) {
          return announcementBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 6) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.AnnouncementMsg announcement = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsgOrBuilder> 
          getAnnouncementFieldBuilder() {
        if (announcementBuilder_ == null) {
          if (!(typeCase_ == 6)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.getDefaultInstance();
          }
          announcementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.AnnouncementMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 6;
        onChanged();;
        return announcementBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsgOrBuilder> joinBuilder_;
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       * @return Whether the join field is set.
       */
      @java.lang.Override
      public boolean hasJoin() {
        return typeCase_ == 7;
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       * @return The join.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg getJoin() {
        if (joinBuilder_ == null) {
          if (typeCase_ == 7) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 7) {
            return joinBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       */
      public Builder setJoin(me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg value) {
        if (joinBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          joinBuilder_.setMessage(value);
        }
        typeCase_ = 7;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       */
      public Builder setJoin(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder builderForValue) {
        if (joinBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          joinBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 7;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       */
      public Builder mergeJoin(me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg value) {
        if (joinBuilder_ == null) {
          if (typeCase_ == 7 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 7) {
            joinBuilder_.mergeFrom(value);
          }
          joinBuilder_.setMessage(value);
        }
        typeCase_ = 7;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       */
      public Builder clearJoin() {
        if (joinBuilder_ == null) {
          if (typeCase_ == 7) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 7) {
            typeCase_ = 0;
            type_ = null;
          }
          joinBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder getJoinBuilder() {
        return getJoinFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsgOrBuilder getJoinOrBuilder() {
        if ((typeCase_ == 7) && (joinBuilder_ != null)) {
          return joinBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 7) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.JoinMsg join = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsgOrBuilder> 
          getJoinFieldBuilder() {
        if (joinBuilder_ == null) {
          if (!(typeCase_ == 7)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.getDefaultInstance();
          }
          joinBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.JoinMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 7;
        onChanged();;
        return joinBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsgOrBuilder> errorBuilder_;
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       * @return Whether the error field is set.
       */
      @java.lang.Override
      public boolean hasError() {
        return typeCase_ == 8;
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       * @return The error.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg getError() {
        if (errorBuilder_ == null) {
          if (typeCase_ == 8) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 8) {
            return errorBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       */
      public Builder setError(me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg value) {
        if (errorBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          errorBuilder_.setMessage(value);
        }
        typeCase_ = 8;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       */
      public Builder setError(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder builderForValue) {
        if (errorBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          errorBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 8;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       */
      public Builder mergeError(me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg value) {
        if (errorBuilder_ == null) {
          if (typeCase_ == 8 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 8) {
            errorBuilder_.mergeFrom(value);
          }
          errorBuilder_.setMessage(value);
        }
        typeCase_ = 8;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       */
      public Builder clearError() {
        if (errorBuilder_ == null) {
          if (typeCase_ == 8) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 8) {
            typeCase_ = 0;
            type_ = null;
          }
          errorBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder getErrorBuilder() {
        return getErrorFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsgOrBuilder getErrorOrBuilder() {
        if ((typeCase_ == 8) && (errorBuilder_ != null)) {
          return errorBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 8) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.ErrorMsg error = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsgOrBuilder> 
          getErrorFieldBuilder() {
        if (errorBuilder_ == null) {
          if (!(typeCase_ == 8)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.getDefaultInstance();
          }
          errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.ErrorMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 8;
        onChanged();;
        return errorBuilder_;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsgOrBuilder> roleChangeBuilder_;
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       * @return Whether the roleChange field is set.
       */
      @java.lang.Override
      public boolean hasRoleChange() {
        return typeCase_ == 9;
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       * @return The roleChange.
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg getRoleChange() {
        if (roleChangeBuilder_ == null) {
          if (typeCase_ == 9) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.getDefaultInstance();
        } else {
          if (typeCase_ == 9) {
            return roleChangeBuilder_.getMessage();
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       */
      public Builder setRoleChange(me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg value) {
        if (roleChangeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          type_ = value;
          onChanged();
        } else {
          roleChangeBuilder_.setMessage(value);
        }
        typeCase_ = 9;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       */
      public Builder setRoleChange(
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder builderForValue) {
        if (roleChangeBuilder_ == null) {
          type_ = builderForValue.build();
          onChanged();
        } else {
          roleChangeBuilder_.setMessage(builderForValue.build());
        }
        typeCase_ = 9;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       */
      public Builder mergeRoleChange(me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg value) {
        if (roleChangeBuilder_ == null) {
          if (typeCase_ == 9 &&
              type_ != me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.getDefaultInstance()) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.newBuilder((me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_)
                .mergeFrom(value).buildPartial();
          } else {
            type_ = value;
          }
          onChanged();
        } else {
          if (typeCase_ == 9) {
            roleChangeBuilder_.mergeFrom(value);
          }
          roleChangeBuilder_.setMessage(value);
        }
        typeCase_ = 9;
        return this;
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       */
      public Builder clearRoleChange() {
        if (roleChangeBuilder_ == null) {
          if (typeCase_ == 9) {
            typeCase_ = 0;
            type_ = null;
            onChanged();
          }
        } else {
          if (typeCase_ == 9) {
            typeCase_ = 0;
            type_ = null;
          }
          roleChangeBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       */
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder getRoleChangeBuilder() {
        return getRoleChangeFieldBuilder().getBuilder();
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       */
      @java.lang.Override
      public me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsgOrBuilder getRoleChangeOrBuilder() {
        if ((typeCase_ == 9) && (roleChangeBuilder_ != null)) {
          return roleChangeBuilder_.getMessageOrBuilder();
        } else {
          if (typeCase_ == 9) {
            return (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_;
          }
          return me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.getDefaultInstance();
        }
      }
      /**
       * <code>.snakes.GameMessage.RoleChangeMsg role_change = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsgOrBuilder> 
          getRoleChangeFieldBuilder() {
        if (roleChangeBuilder_ == null) {
          if (!(typeCase_ == 9)) {
            type_ = me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.getDefaultInstance();
          }
          roleChangeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg.Builder, me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsgOrBuilder>(
                  (me.ippolitov.fit.snakes.SnakesProto.GameMessage.RoleChangeMsg) type_,
                  getParentForChildren(),
                  isClean());
          type_ = null;
        }
        typeCase_ = 9;
        onChanged();;
        return roleChangeBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:snakes.GameMessage)
    }

    // @@protoc_insertion_point(class_scope:snakes.GameMessage)
    private static final me.ippolitov.fit.snakes.SnakesProto.GameMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new me.ippolitov.fit.snakes.SnakesProto.GameMessage();
    }

    public static me.ippolitov.fit.snakes.SnakesProto.GameMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<GameMessage>
        PARSER = new com.google.protobuf.AbstractParser<GameMessage>() {
      @java.lang.Override
      public GameMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GameMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GameMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public me.ippolitov.fit.snakes.SnakesProto.GameMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GamePlayer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GamePlayer_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameConfig_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GamePlayers_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GamePlayers_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameState_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameState_Coord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameState_Coord_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameState_Snake_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameState_Snake_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_PingMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_PingMsg_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_SteerMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_SteerMsg_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_AckMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_AckMsg_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_StateMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_StateMsg_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_AnnouncementMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_AnnouncementMsg_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_JoinMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_JoinMsg_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_ErrorMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_ErrorMsg_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_snakes_GameMessage_RoleChangeMsg_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_snakes_GameMessage_RoleChangeMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014snakes.proto\022\006snakes\"\240\001\n\nGamePlayer\022\014\n" +
      "\004name\030\001 \002(\t\022\n\n\002id\030\002 \002(\005\022\022\n\nip_address\030\003 " +
      "\002(\t\022\014\n\004port\030\004 \002(\005\022\036\n\004role\030\005 \002(\0162\020.snakes" +
      ".NodeRole\022\'\n\004type\030\006 \001(\0162\022.snakes.PlayerT" +
      "ype:\005HUMAN\022\r\n\005score\030\007 \002(\005\"\334\001\n\nGameConfig" +
      "\022\021\n\005width\030\001 \001(\005:\00240\022\022\n\006height\030\002 \001(\005:\00230\022" +
      "\026\n\013food_static\030\003 \001(\005:\0011\022\032\n\017food_per_play" +
      "er\030\004 \001(\002:\0011\022\034\n\016state_delay_ms\030\005 \001(\005:\004100" +
      "0\022\033\n\016dead_food_prob\030\006 \001(\002:\0030.1\022\032\n\rping_d" +
      "elay_ms\030\007 \001(\005:\003100\022\034\n\017node_timeout_ms\030\010 " +
      "\001(\005:\003800\"2\n\013GamePlayers\022#\n\007players\030\001 \003(\013" +
      "2\022.snakes.GamePlayer\"\260\003\n\tGameState\022\023\n\013st" +
      "ate_order\030\001 \002(\005\022\'\n\006snakes\030\002 \003(\0132\027.snakes" +
      ".GameState.Snake\022&\n\005foods\030\003 \003(\0132\027.snakes" +
      ".GameState.Coord\022$\n\007players\030\004 \002(\0132\023.snak" +
      "es.GamePlayers\022\"\n\006config\030\005 \002(\0132\022.snakes." +
      "GameConfig\032#\n\005Coord\022\014\n\001x\030\001 \001(\021:\0010\022\014\n\001y\030\002" +
      " \001(\021:\0010\032\315\001\n\005Snake\022\021\n\tplayer_id\030\001 \002(\005\022\'\n\006" +
      "points\030\002 \003(\0132\027.snakes.GameState.Coord\0228\n" +
      "\005state\030\003 \002(\0162\".snakes.GameState.Snake.Sn" +
      "akeState:\005ALIVE\022)\n\016head_direction\030\004 \002(\0162" +
      "\021.snakes.Direction\"#\n\nSnakeState\022\t\n\005ALIV" +
      "E\020\000\022\n\n\006ZOMBIE\020\001\"\250\007\n\013GameMessage\022\017\n\007msg_s" +
      "eq\030\001 \002(\003\022\021\n\tsender_id\030\n \001(\005\022\023\n\013receiver_" +
      "id\030\013 \001(\005\022+\n\004ping\030\002 \001(\0132\033.snakes.GameMess" +
      "age.PingMsgH\000\022-\n\005steer\030\003 \001(\0132\034.snakes.Ga" +
      "meMessage.SteerMsgH\000\022)\n\003ack\030\004 \001(\0132\032.snak" +
      "es.GameMessage.AckMsgH\000\022-\n\005state\030\005 \001(\0132\034" +
      ".snakes.GameMessage.StateMsgH\000\022;\n\014announ" +
      "cement\030\006 \001(\0132#.snakes.GameMessage.Announ" +
      "cementMsgH\000\022+\n\004join\030\007 \001(\0132\033.snakes.GameM" +
      "essage.JoinMsgH\000\022-\n\005error\030\010 \001(\0132\034.snakes" +
      ".GameMessage.ErrorMsgH\000\0228\n\013role_change\030\t" +
      " \001(\0132!.snakes.GameMessage.RoleChangeMsgH" +
      "\000\032\t\n\007PingMsg\0320\n\010SteerMsg\022$\n\tdirection\030\001 " +
      "\002(\0162\021.snakes.Direction\032\010\n\006AckMsg\032,\n\010Stat" +
      "eMsg\022 \n\005state\030\001 \002(\0132\021.snakes.GameState\032s" +
      "\n\017AnnouncementMsg\022$\n\007players\030\001 \002(\0132\023.sna" +
      "kes.GamePlayers\022\"\n\006config\030\002 \002(\0132\022.snakes" +
      ".GameConfig\022\026\n\010can_join\030\003 \001(\010:\004true\032a\n\007J" +
      "oinMsg\022.\n\013player_type\030\001 \001(\0162\022.snakes.Pla" +
      "yerType:\005HUMAN\022\030\n\tonly_view\030\002 \001(\010:\005false" +
      "\022\014\n\004name\030\003 \002(\t\032!\n\010ErrorMsg\022\025\n\rerror_mess" +
      "age\030\001 \002(\t\032_\n\rRoleChangeMsg\022%\n\013sender_rol" +
      "e\030\001 \001(\0162\020.snakes.NodeRole\022\'\n\rreceiver_ro" +
      "le\030\002 \001(\0162\020.snakes.NodeRoleB\006\n\004Type*:\n\010No" +
      "deRole\022\n\n\006NORMAL\020\000\022\n\n\006MASTER\020\001\022\n\n\006DEPUTY" +
      "\020\002\022\n\n\006VIEWER\020\003*\"\n\nPlayerType\022\t\n\005HUMAN\020\000\022" +
      "\t\n\005ROBOT\020\001*2\n\tDirection\022\006\n\002UP\020\001\022\010\n\004DOWN\020" +
      "\002\022\010\n\004LEFT\020\003\022\t\n\005RIGHT\020\004B&\n\027me.ippolitov.f" +
      "it.snakesB\013SnakesProto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_snakes_GamePlayer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_snakes_GamePlayer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GamePlayer_descriptor,
        new java.lang.String[] { "Name", "Id", "IpAddress", "Port", "Role", "Type", "Score", });
    internal_static_snakes_GameConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_snakes_GameConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameConfig_descriptor,
        new java.lang.String[] { "Width", "Height", "FoodStatic", "FoodPerPlayer", "StateDelayMs", "DeadFoodProb", "PingDelayMs", "NodeTimeoutMs", });
    internal_static_snakes_GamePlayers_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_snakes_GamePlayers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GamePlayers_descriptor,
        new java.lang.String[] { "Players", });
    internal_static_snakes_GameState_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_snakes_GameState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameState_descriptor,
        new java.lang.String[] { "StateOrder", "Snakes", "Foods", "Players", "Config", });
    internal_static_snakes_GameState_Coord_descriptor =
      internal_static_snakes_GameState_descriptor.getNestedTypes().get(0);
    internal_static_snakes_GameState_Coord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameState_Coord_descriptor,
        new java.lang.String[] { "X", "Y", });
    internal_static_snakes_GameState_Snake_descriptor =
      internal_static_snakes_GameState_descriptor.getNestedTypes().get(1);
    internal_static_snakes_GameState_Snake_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameState_Snake_descriptor,
        new java.lang.String[] { "PlayerId", "Points", "State", "HeadDirection", });
    internal_static_snakes_GameMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_snakes_GameMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_descriptor,
        new java.lang.String[] { "MsgSeq", "SenderId", "ReceiverId", "Ping", "Steer", "Ack", "State", "Announcement", "Join", "Error", "RoleChange", "Type", });
    internal_static_snakes_GameMessage_PingMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(0);
    internal_static_snakes_GameMessage_PingMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_PingMsg_descriptor,
        new java.lang.String[] { });
    internal_static_snakes_GameMessage_SteerMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(1);
    internal_static_snakes_GameMessage_SteerMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_SteerMsg_descriptor,
        new java.lang.String[] { "Direction", });
    internal_static_snakes_GameMessage_AckMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(2);
    internal_static_snakes_GameMessage_AckMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_AckMsg_descriptor,
        new java.lang.String[] { });
    internal_static_snakes_GameMessage_StateMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(3);
    internal_static_snakes_GameMessage_StateMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_StateMsg_descriptor,
        new java.lang.String[] { "State", });
    internal_static_snakes_GameMessage_AnnouncementMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(4);
    internal_static_snakes_GameMessage_AnnouncementMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_AnnouncementMsg_descriptor,
        new java.lang.String[] { "Players", "Config", "CanJoin", });
    internal_static_snakes_GameMessage_JoinMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(5);
    internal_static_snakes_GameMessage_JoinMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_JoinMsg_descriptor,
        new java.lang.String[] { "PlayerType", "OnlyView", "Name", });
    internal_static_snakes_GameMessage_ErrorMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(6);
    internal_static_snakes_GameMessage_ErrorMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_ErrorMsg_descriptor,
        new java.lang.String[] { "ErrorMessage", });
    internal_static_snakes_GameMessage_RoleChangeMsg_descriptor =
      internal_static_snakes_GameMessage_descriptor.getNestedTypes().get(7);
    internal_static_snakes_GameMessage_RoleChangeMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_snakes_GameMessage_RoleChangeMsg_descriptor,
        new java.lang.String[] { "SenderRole", "ReceiverRole", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
