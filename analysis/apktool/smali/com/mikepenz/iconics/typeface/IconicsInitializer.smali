.class public final Lcom/mikepenz/iconics/typeface/IconicsInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm2/b;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final create(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LO4/c;->a:LO4/c;

    .line 7
    .line 8
    sget-object v0, LO4/c;->b:Landroid/content/Context;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sput-object p1, LO4/c;->b:Landroid/content/Context;

    .line 17
    .line 18
    :cond_0
    sget-object p1, LO4/c;->a:LO4/c;

    .line 19
    .line 20
    return-object p1
.end method

.method public final dependencies()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 2
    .line 3
    return-object v0
.end method
