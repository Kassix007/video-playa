.class public final LM/r;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LM/s;


# direct methods
.method public synthetic constructor <init>(LM/s;I)V
    .locals 0

    .line 1
    iput p2, p0, LM/r;->q:I

    iput-object p1, p0, LM/r;->r:LM/s;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LM/r;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LM/r;->r:LM/s;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, LM/t0;->b:LP/z;

    .line 9
    .line 10
    invoke-static {v1, v0}, LB0/g;->i(LB0/l;LP/l0;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LM/r0;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v1, LM/s;->K:LL/b;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LB0/n;->y0(LB0/m;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, v1, LM/s;->K:LL/b;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    new-instance v6, Lk3/d;

    .line 31
    .line 32
    const/16 v0, 0x8

    .line 33
    .line 34
    invoke-direct {v6, v0, v1}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v7, LM/r;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {v7, v1, v0}, LM/r;-><init>(LM/s;I)V

    .line 41
    .line 42
    .line 43
    iget-object v3, v1, LM/s;->G:Ly/i;

    .line 44
    .line 45
    iget-boolean v4, v1, LM/s;->H:Z

    .line 46
    .line 47
    iget v5, v1, LM/s;->I:F

    .line 48
    .line 49
    sget-object v0, LL/l;->a:Lu/z0;

    .line 50
    .line 51
    new-instance v2, LL/b;

    .line 52
    .line 53
    invoke-direct/range {v2 .. v7}, LL/b;-><init>(Ly/i;ZFLk3/d;LM/r;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, LB0/n;->x0(LB0/m;)LB0/m;

    .line 57
    .line 58
    .line 59
    iput-object v2, v1, LM/s;->K:LL/b;

    .line 60
    .line 61
    :cond_1
    :goto_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_0
    sget-object v0, LM/t0;->b:LP/z;

    .line 65
    .line 66
    invoke-static {v1, v0}, LB0/g;->i(LB0/l;LP/l0;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, LM/r0;

    .line 71
    .line 72
    sget-object v0, LM/s0;->a:LL/g;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
