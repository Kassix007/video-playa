.class public final Lz0/Q;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lz0/S;


# direct methods
.method public synthetic constructor <init>(Lz0/S;I)V
    .locals 0

    .line 1
    iput p2, p0, Lz0/Q;->q:I

    iput-object p1, p0, Lz0/Q;->r:Lz0/S;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lz0/Q;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LB0/L;

    .line 7
    .line 8
    check-cast p2, Lz0/S;

    .line 9
    .line 10
    iget-object p2, p0, Lz0/Q;->r:Lz0/S;

    .line 11
    .line 12
    iget-object v0, p2, Lz0/S;->a:Lz0/U;

    .line 13
    .line 14
    iget-object v1, p1, LB0/L;->W:Lz0/y;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Lz0/y;

    .line 19
    .line 20
    invoke-direct {v1, p1, v0}, Lz0/y;-><init>(LB0/L;Lz0/U;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p1, LB0/L;->W:Lz0/y;

    .line 24
    .line 25
    :cond_0
    iput-object v1, p2, Lz0/S;->b:Lz0/y;

    .line 26
    .line 27
    invoke-virtual {p2}, Lz0/S;->a()Lz0/y;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lz0/y;->b()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lz0/S;->a()Lz0/y;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object p2, p1, Lz0/y;->s:Lz0/U;

    .line 39
    .line 40
    if-eq p2, v0, :cond_1

    .line 41
    .line 42
    iput-object v0, p1, Lz0/y;->s:Lz0/U;

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-virtual {p1, p2}, Lz0/y;->c(Z)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p1, Lz0/y;->q:LB0/L;

    .line 49
    .line 50
    const/4 v0, 0x7

    .line 51
    invoke-static {p1, p2, v0}, LB0/L;->S(LB0/L;ZI)V

    .line 52
    .line 53
    .line 54
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_0
    check-cast p1, LB0/L;

    .line 58
    .line 59
    check-cast p2, LB5/e;

    .line 60
    .line 61
    iget-object v0, p0, Lz0/Q;->r:Lz0/S;

    .line 62
    .line 63
    invoke-virtual {v0}, Lz0/S;->a()Lz0/y;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v1, Lz0/v;

    .line 68
    .line 69
    invoke-direct {v1, v0, p2}, Lz0/v;-><init>(Lz0/y;LB5/e;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, LB0/L;->X(Lz0/C;)V

    .line 73
    .line 74
    .line 75
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_1
    check-cast p1, LB0/L;

    .line 79
    .line 80
    check-cast p2, LP/r;

    .line 81
    .line 82
    iget-object p1, p0, Lz0/Q;->r:Lz0/S;

    .line 83
    .line 84
    invoke-virtual {p1}, Lz0/S;->a()Lz0/y;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p2, p1, Lz0/y;->r:LP/r;

    .line 89
    .line 90
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
