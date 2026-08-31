.class public final LC0/Q0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/e;


# direct methods
.method public constructor <init>(LB5/e;I)V
    .locals 1

    .line 1
    iput p2, p0, LC0/Q0;->q:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LC0/Q0;->r:LB5/e;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    sget-object p2, Lu/A0;->a:LZ/m;

    .line 14
    .line 15
    iput-object p1, p0, LC0/Q0;->r:LB5/e;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LC0/Q0;->q:I

    .line 2
    .line 3
    sget-object v1, Lm5/y;->a:Lm5/y;

    .line 4
    .line 5
    iget-object v2, p0, LC0/Q0;->r:LB5/e;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lu/j;

    .line 11
    .line 12
    iget-object v0, p1, Lu/j;->e:LP/f0;

    .line 13
    .line 14
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v3, Lu/A0;->a:LZ/m;

    .line 19
    .line 20
    iget-object p1, p1, Lu/j;->f:Lu/q;

    .line 21
    .line 22
    check-cast p1, Lu/m;

    .line 23
    .line 24
    iget p1, p1, Lu/m;->a:F

    .line 25
    .line 26
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v2, v0, p1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_0
    check-cast p1, Lj0/m;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-interface {v2, p1, v0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
