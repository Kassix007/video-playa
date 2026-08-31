.class public final LM/y0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LB5/e;

.field public final synthetic s:LX/e;

.field public final synthetic t:LB5/e;

.field public final synthetic u:LB5/e;

.field public final synthetic v:LA/W;

.field public final synthetic w:LB5/e;

.field public final synthetic x:I


# direct methods
.method public constructor <init>(ILB5/e;LX/e;LB5/e;LB5/e;LA/W;LB5/e;I)V
    .locals 0

    .line 1
    iput p1, p0, LM/y0;->q:I

    .line 2
    .line 3
    iput-object p2, p0, LM/y0;->r:LB5/e;

    .line 4
    .line 5
    iput-object p3, p0, LM/y0;->s:LX/e;

    .line 6
    .line 7
    iput-object p4, p0, LM/y0;->t:LB5/e;

    .line 8
    .line 9
    iput-object p5, p0, LM/y0;->u:LB5/e;

    .line 10
    .line 11
    iput-object p6, p0, LM/y0;->v:LA/W;

    .line 12
    .line 13
    iput-object p7, p0, LM/y0;->w:LB5/e;

    .line 14
    .line 15
    iput p8, p0, LM/y0;->x:I

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LM/y0;->x:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget v0, p0, LM/y0;->q:I

    .line 18
    .line 19
    iget-object v1, p0, LM/y0;->r:LB5/e;

    .line 20
    .line 21
    iget-object v2, p0, LM/y0;->s:LX/e;

    .line 22
    .line 23
    iget-object v3, p0, LM/y0;->t:LB5/e;

    .line 24
    .line 25
    iget-object v4, p0, LM/y0;->u:LB5/e;

    .line 26
    .line 27
    iget-object v5, p0, LM/y0;->v:LA/W;

    .line 28
    .line 29
    iget-object v6, p0, LM/y0;->w:LB5/e;

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, LM/z0;->b(ILB5/e;LX/e;LB5/e;LB5/e;LA/W;LB5/e;LP/o;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 35
    .line 36
    return-object p1
.end method
