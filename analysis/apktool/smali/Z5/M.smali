.class public final LZ5/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LR4/b2;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LR4/b2;-><init>(LZ5/M;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lm5/i;->q:Lm5/i;

    .line 10
    .line 11
    invoke-static {v1, v0}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LZ5/M;->a:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    iget-object v0, p0, LZ5/M;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LX5/f;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, LZ5/M;->b()LX5/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, LY5/b;->a(LX5/f;)LY5/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, LZ5/M;->b()LX5/f;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p1, v1}, LY5/a;->j(LX5/f;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, -0x1

    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    invoke-interface {p1, v0}, LY5/a;->l(LX5/f;)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance p1, LV5/d;

    .line 27
    .line 28
    const-string v0, "Unexpected index "

    .line 29
    .line 30
    invoke-static {v1, v0}, Lk1/i;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
