.class public final LM/w;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lo0/b;

.field public final synthetic r:Lc0/m;

.field public final synthetic s:J

.field public final synthetic t:I


# direct methods
.method public constructor <init>(Lo0/b;Lc0/m;JI)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/w;->q:Lo0/b;

    .line 2
    .line 3
    iput-object p2, p0, LM/w;->r:Lc0/m;

    .line 4
    .line 5
    iput-wide p3, p0, LM/w;->s:J

    .line 6
    .line 7
    iput p5, p0, LM/w;->t:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LM/w;->t:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, LM/w;->q:Lo0/b;

    .line 18
    .line 19
    iget-object v1, p0, LM/w;->r:Lc0/m;

    .line 20
    .line 21
    iget-wide v2, p0, LM/w;->s:J

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, LM/x;->a(Lo0/b;Lc0/m;JLP/o;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p1
.end method
