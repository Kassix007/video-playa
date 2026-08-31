.class public final LM/X;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LM/I0;

.field public final synthetic s:LB5/a;


# direct methods
.method public synthetic constructor <init>(LM/I0;LB5/a;I)V
    .locals 0

    .line 1
    iput p3, p0, LM/X;->q:I

    iput-object p1, p0, LM/X;->r:LM/I0;

    iput-object p2, p0, LM/X;->s:LB5/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LM/X;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    iget-object p1, p0, LM/X;->r:LM/I0;

    .line 9
    .line 10
    invoke-virtual {p1}, LM/I0;->c()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, LM/X;->s:LB5/a;

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
    check-cast p1, Ljava/lang/Throwable;

    .line 25
    .line 26
    iget-object p1, p0, LM/X;->r:LM/I0;

    .line 27
    .line 28
    invoke-virtual {p1}, LM/I0;->c()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, LM/X;->s:LB5/a;

    .line 35
    .line 36
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 40
    .line 41
    return-object p1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
