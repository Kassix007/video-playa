.class public final LM/a0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public synthetic q:F

.field public final synthetic r:LB5/c;


# direct methods
.method public constructor <init>(LB5/c;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/a0;->r:LB5/c;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    check-cast p3, Lq5/c;

    .line 10
    .line 11
    new-instance p2, LM/a0;

    .line 12
    .line 13
    iget-object v0, p0, LM/a0;->r:LB5/c;

    .line 14
    .line 15
    invoke-direct {p2, v0, p3}, LM/a0;-><init>(LB5/c;Lq5/c;)V

    .line 16
    .line 17
    .line 18
    iput p1, p2, LM/a0;->q:F

    .line 19
    .line 20
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 21
    .line 22
    invoke-virtual {p2, p1}, LM/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, LM/a0;->q:F

    .line 5
    .line 6
    new-instance v0, Ljava/lang/Float;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LM/a0;->r:LB5/c;

    .line 12
    .line 13
    invoke-interface {p1, v0}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 17
    .line 18
    return-object p1
.end method
