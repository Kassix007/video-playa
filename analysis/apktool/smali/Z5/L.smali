.class public final LZ5/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# instance fields
.field public final a:LV5/a;

.field public final b:LZ5/W;


# direct methods
.method public constructor <init>(LV5/a;)V
    .locals 1

    .line 1
    const-string v0, "serializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LZ5/L;->a:LV5/a;

    .line 10
    .line 11
    new-instance v0, LZ5/W;

    .line 12
    .line 13
    invoke-interface {p1}, LV5/a;->b()LX5/f;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {v0, p1}, LZ5/W;-><init>(LX5/f;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, LZ5/L;->b:LZ5/W;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/L;->b:LZ5/W;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p1}, LY5/b;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LZ5/L;->a:LV5/a;

    .line 8
    .line 9
    invoke-interface {p1, v0}, LY5/b;->p(LV5/a;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    const-class v2, LZ5/L;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, LZ5/L;

    .line 18
    .line 19
    iget-object v2, p0, LZ5/L;->a:LV5/a;

    .line 20
    .line 21
    iget-object p1, p1, LZ5/L;->a:LV5/a;

    .line 22
    .line 23
    invoke-static {v2, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    return v0

    .line 31
    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/L;->a:LV5/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
