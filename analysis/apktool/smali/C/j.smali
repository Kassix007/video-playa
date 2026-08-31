.class public final LC/j;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LP/W;


# direct methods
.method public synthetic constructor <init>(LP/W;I)V
    .locals 0

    .line 1
    iput p2, p0, LC/j;->q:I

    iput-object p1, p0, LC/j;->r:LP/W;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LC/j;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LC/j;->r:LP/W;

    .line 7
    .line 8
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LL/g;

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, LC/j;->r:LP/W;

    .line 16
    .line 17
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LB5/a;

    .line 22
    .line 23
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LE/x;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, LD/h;

    .line 31
    .line 32
    iget-object v1, p0, LC/j;->r:LP/W;

    .line 33
    .line 34
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, LB5/c;

    .line 39
    .line 40
    invoke-direct {v0, v1}, LD/h;-><init>(LB5/c;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_2
    new-instance v0, LC/g;

    .line 45
    .line 46
    iget-object v1, p0, LC/j;->r:LP/W;

    .line 47
    .line 48
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, LB5/c;

    .line 53
    .line 54
    invoke-direct {v0, v1}, LC/g;-><init>(LB5/c;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
