.class public final LP0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LP0/c;->a:Landroid/view/View;

    .line 3
    new-instance p1, LA0/d;

    const/16 v0, 0xc

    invoke-direct {p1, v0, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    sget-object v0, Lm5/i;->r:Lm5/i;

    invoke-static {v0, p1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    move-result-object p1

    iput-object p1, p0, LP0/c;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LC0/A;)V
    .locals 3

    .line 4
    new-instance p2, LP0/c;

    invoke-direct {p2, p1}, LP0/c;-><init>(Landroid/view/View;)V

    .line 5
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LP0/c;->a:Landroid/view/View;

    .line 8
    new-instance p1, LP0/d;

    .line 9
    sget-wide v0, LL0/E;->b:J

    .line 10
    new-instance p2, LL0/d;

    const-string v2, ""

    invoke-direct {p2, v2}, LL0/d;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2, v0, v1}, LP0/d;-><init>(LL0/d;J)V

    .line 11
    sget p1, LP0/b;->e:I

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    new-instance p1, LA0/d;

    const/16 p2, 0xd

    invoke-direct {p1, p2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    sget-object p2, Lm5/i;->r:Lm5/i;

    invoke-static {p2, p1}, Lm5/a;->c(Lm5/i;LB5/a;)Lm5/h;

    move-result-object p1

    iput-object p1, p0, LP0/c;->b:Ljava/lang/Object;

    .line 14
    new-instance p1, Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    invoke-direct {p1}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;-><init>()V

    .line 15
    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    return-void
.end method
