.class public final Lcom/mikepenz/iconics/typeface/library/fontawesome/Initializer;
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
    sget-object p1, Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;->INSTANCE:Lcom/mikepenz/iconics/typeface/library/fontawesome/FontAwesome;

    .line 7
    .line 8
    invoke-static {p1}, LO4/c;->a(LO4/b;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, LP4/c;->a:LP4/c;

    .line 12
    .line 13
    invoke-static {v0}, LO4/c;->a(LO4/b;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, LP4/e;->a:LP4/e;

    .line 17
    .line 18
    invoke-static {v0}, LO4/c;->a(LO4/b;)V

    .line 19
    .line 20
    .line 21
    return-object p1
.end method

.method public final dependencies()Ljava/util/List;
    .locals 1

    .line 1
    const-class v0, Lcom/mikepenz/iconics/typeface/IconicsInitializer;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
