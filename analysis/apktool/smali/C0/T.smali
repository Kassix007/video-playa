.class public final LC0/T;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC0/T;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC0/T;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC0/T;->a:LC0/T;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1}, LB3/e;->o(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b(Landroid/view/View;)V
    .locals 1

    .line 1
    sget-object v0, LC0/Q;->a:LC0/Q;

    .line 2
    .line 3
    sget-object v0, LC0/Q;->a:LC0/Q;

    .line 4
    .line 5
    sget-object v0, LC0/Q;->a:LC0/Q;

    .line 6
    .line 7
    invoke-static {p1, v0}, LB3/e;->p(Landroid/view/View;Landroid/view/translation/ViewTranslationCallback;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
