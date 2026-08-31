.class public final LM/L;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LM/M;


# direct methods
.method public synthetic constructor <init>(LM/M;I)V
    .locals 0

    .line 1
    iput p2, p0, LM/L;->q:I

    iput-object p1, p0, LM/L;->r:LM/M;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LM/L;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/F;

    .line 7
    .line 8
    iget-object p1, p0, LM/L;->r:LM/M;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 11
    .line 12
    .line 13
    new-instance v0, LC0/Y;

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    invoke-direct {v0, v1, p1}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    check-cast p1, Lb/u;

    .line 21
    .line 22
    iget-object p1, p0, LM/L;->r:LM/M;

    .line 23
    .line 24
    iget-object v0, p1, LM/M;->u:LM/h0;

    .line 25
    .line 26
    iget-boolean v0, v0, LM/h0;->b:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p1, p1, LM/M;->t:LB5/a;

    .line 31
    .line 32
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 36
    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
