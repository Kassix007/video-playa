.class public final LC0/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LC0/m1;->q:I

    iput-object p2, p0, LC0/m1;->r:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget p2, p0, LC0/m1;->q:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, LC0/m1;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p2, Lkotlin/jvm/internal/y;

    .line 9
    .line 10
    iput-object p1, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p1, LQ5/a;

    .line 13
    .line 14
    invoke-direct {p1, p0}, LQ5/a;-><init>(LP5/i;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object p2, p0, LC0/m1;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, LC0/K0;

    .line 27
    .line 28
    iget-object p2, p2, LC0/K0;->q:LP/b0;

    .line 29
    .line 30
    invoke-virtual {p2, p1}, LP/b0;->f(F)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 34
    .line 35
    return-object p1

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
