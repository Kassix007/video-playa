.class public final La6/u;
.super La6/B;
.source "SourceFile"


# static fields
.field public static final INSTANCE:La6/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La6/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La6/u;->INSTANCE:La6/u;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "null"

    .line 2
    .line 3
    return-object v0
.end method

.method public final serializer()LV5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LV5/a;"
        }
    .end annotation

    .line 1
    sget-object v0, La6/v;->a:La6/v;

    .line 2
    .line 3
    return-object v0
.end method
