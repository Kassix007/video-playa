.class public final synthetic LZ5/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LZ5/P;


# direct methods
.method public synthetic constructor <init>(LZ5/P;I)V
    .locals 0

    .line 1
    iput p2, p0, LZ5/O;->q:I

    iput-object p1, p0, LZ5/O;->r:LZ5/P;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LZ5/O;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ5/O;->r:LZ5/P;

    .line 7
    .line 8
    iget-object v1, v0, LZ5/P;->j:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-interface {v1}, Lm5/h;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, [LX5/f;

    .line 15
    .line 16
    invoke-static {v0, v1}, LZ5/N;->d(LX5/f;[LX5/f;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_0
    iget-object v0, p0, LZ5/O;->r:LZ5/P;

    .line 26
    .line 27
    iget-object v0, v0, LZ5/P;->b:LZ5/w;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v0, 0x0

    .line 39
    :goto_0
    invoke-static {v0}, LZ5/N;->c(Ljava/util/List;)[LX5/f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :pswitch_1
    iget-object v0, p0, LZ5/O;->r:LZ5/P;

    .line 45
    .line 46
    iget-object v0, v0, LZ5/P;->b:LZ5/w;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-interface {v0}, LZ5/w;->a()[LV5/a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    sget-object v0, LZ5/N;->b:[LV5/a;

    .line 56
    .line 57
    :goto_1
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
