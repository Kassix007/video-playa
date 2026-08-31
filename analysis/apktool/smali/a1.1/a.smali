.class public final La1/a;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:La1/j;


# direct methods
.method public synthetic constructor <init>(La1/j;I)V
    .locals 0

    .line 1
    iput p2, p0, La1/a;->q:I

    iput-object p1, p0, La1/a;->r:La1/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, La1/a;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lb/u;

    .line 7
    .line 8
    iget-object p1, p0, La1/a;->r:La1/j;

    .line 9
    .line 10
    iget-object v0, p1, La1/j;->u:La1/i;

    .line 11
    .line 12
    iget-boolean v0, v0, La1/i;->a:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, La1/j;->t:LB5/a;

    .line 17
    .line 18
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, LP/F;

    .line 25
    .line 26
    iget-object p1, p0, La1/a;->r:La1/j;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 29
    .line 30
    .line 31
    new-instance v0, LC0/Y;

    .line 32
    .line 33
    const/4 v1, 0x5

    .line 34
    invoke-direct {v0, v1, p1}, LC0/Y;-><init>(ILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
