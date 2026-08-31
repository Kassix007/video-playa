.class public final LB0/k0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB0/n0;


# direct methods
.method public synthetic constructor <init>(LB0/n0;I)V
    .locals 0

    .line 1
    iput p2, p0, LB0/k0;->q:I

    iput-object p1, p0, LB0/k0;->r:LB0/n0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LB0/k0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB0/k0;->r:LB0/n0;

    .line 7
    .line 8
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LB0/n0;->I0()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, LB0/k0;->r:LB0/n0;

    .line 19
    .line 20
    iget-object v1, v0, LB0/n0;->R:Lj0/m;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, LB0/n0;->Q:Lm0/c;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, LB0/n0;->u0(Lj0/m;Lm0/c;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
